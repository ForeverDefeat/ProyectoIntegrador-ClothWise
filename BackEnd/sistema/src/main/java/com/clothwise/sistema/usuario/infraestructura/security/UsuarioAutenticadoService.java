package com.clothwise.sistema.usuario.infraestructura.security;

import com.clothwise.sistema.shared.dominio.exception.NotFoundException;
import com.clothwise.sistema.usuario.dominio.Usuario;
import com.clothwise.sistema.usuario.dominio.ports.IUsuarioRepository;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Servicio de infraestructura para resolver el usuario autenticado desde Spring Security.
 */
public class UsuarioAutenticadoService {

    private final IUsuarioRepository usuarioRepository;

    public UsuarioAutenticadoService(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public String obtenerCorreoActual() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new AuthenticationCredentialsNotFoundException("No hay usuario autenticado.");
        }

        Object principal = authentication.getPrincipal();
        if (principal instanceof String correo && !correo.isBlank()) {
            return correo;
        }

        throw new AuthenticationCredentialsNotFoundException("Principal de autenticacion invalido.");
    }

    public Usuario obtenerUsuarioActual() {
        String correo = obtenerCorreoActual();
        return usuarioRepository.findByCorreo(correo)
                .orElseThrow(() -> new NotFoundException(
                        "Usuario autenticado no encontrado con correo: " + correo
                ));
    }

    public Long obtenerIdUsuarioActual() {
        return obtenerUsuarioActual().getId();
    }
}

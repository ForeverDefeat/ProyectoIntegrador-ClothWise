package com.clothwise.sistema.venta.infraestructura.controllers;

import com.clothwise.sistema.usuario.dominio.RolUsuario;
import com.clothwise.sistema.usuario.dominio.Usuario;
import com.clothwise.sistema.usuario.infraestructura.security.UsuarioAutenticadoService;
import com.clothwise.sistema.venta.aplicacion.dto.VentaResponseDTO;
import com.clothwise.sistema.venta.aplicacion.ports.IAnularVentaUseCase;
import com.clothwise.sistema.venta.aplicacion.ports.IConsultarVentaUseCase;
import com.clothwise.sistema.venta.aplicacion.ports.IRegistrarVentaUseCase;
import com.clothwise.sistema.venta.dominio.EstadoVenta;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

class VentaRestControllerTest {

    private final IRegistrarVentaUseCase registrarVentaUseCase = mock(IRegistrarVentaUseCase.class);
    private final IConsultarVentaUseCase consultarVentaUseCase = mock(IConsultarVentaUseCase.class);
    private final IAnularVentaUseCase anularVentaUseCase = mock(IAnularVentaUseCase.class);
    private final UsuarioAutenticadoService usuarioAutenticadoService = mock(UsuarioAutenticadoService.class);

    @Test
    void adminListaTodasLasVentasSinFiltros() {
        VentaRestController controller = crearController();
        when(usuarioAutenticadoService.obtenerUsuarioActual()).thenReturn(usuario(1L, RolUsuario.ADMIN));
        when(consultarVentaUseCase.buscarTodas()).thenReturn(List.of());

        controller.listarVentas(null, null, null);

        verify(consultarVentaUseCase).buscarTodas();
    }

    @Test
    void vendedorFiltraPorEstadoSoloSobreSusVentas() {
        VentaRestController controller = crearController();
        when(usuarioAutenticadoService.obtenerUsuarioActual()).thenReturn(usuario(9L, RolUsuario.VENDEDOR));
        when(consultarVentaUseCase.buscarPorUsuarioYEstado(9L, EstadoVenta.COMPLETADA))
                .thenReturn(List.<VentaResponseDTO>of());

        controller.listarVentas(EstadoVenta.COMPLETADA, null, null);

        verify(consultarVentaUseCase).buscarPorUsuarioYEstado(9L, EstadoVenta.COMPLETADA);
        verifyNoInteractions(registrarVentaUseCase, anularVentaUseCase);
    }

    private VentaRestController crearController() {
        return new VentaRestController(
                registrarVentaUseCase,
                consultarVentaUseCase,
                anularVentaUseCase,
                usuarioAutenticadoService
        );
    }

    private Usuario usuario(Long id, RolUsuario rol) {
        return new Usuario(id, "Usuario", "usuario@omgmoda.com", "hash", rol);
    }
}

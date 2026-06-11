package com.clothwise.sistema.inventario.infraestructura.transaction;

import com.clothwise.sistema.inventario.aplicacion.dto.MovimientoResponseDTO;
import com.clothwise.sistema.inventario.aplicacion.dto.RegistrarAjusteDTO;
import com.clothwise.sistema.inventario.aplicacion.ports.IRegistrarAjusteUseCase;
import org.springframework.transaction.annotation.Transactional;

public class TransactionalRegistrarAjusteUseCase implements IRegistrarAjusteUseCase {

    private final IRegistrarAjusteUseCase delegate;

    public TransactionalRegistrarAjusteUseCase(IRegistrarAjusteUseCase delegate) {
        this.delegate = delegate;
    }

    @Override
    @Transactional
    public MovimientoResponseDTO ajustar(RegistrarAjusteDTO dto, Long idUsuario) {
        return delegate.ajustar(dto, idUsuario);
    }
}

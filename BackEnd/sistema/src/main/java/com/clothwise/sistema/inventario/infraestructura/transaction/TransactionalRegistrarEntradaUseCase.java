package com.clothwise.sistema.inventario.infraestructura.transaction;

import com.clothwise.sistema.inventario.aplicacion.dto.MovimientoResponseDTO;
import com.clothwise.sistema.inventario.aplicacion.dto.RegistrarEntradaDTO;
import com.clothwise.sistema.inventario.aplicacion.ports.IRegistrarEntradaUseCase;
import org.springframework.transaction.annotation.Transactional;

public class TransactionalRegistrarEntradaUseCase implements IRegistrarEntradaUseCase {

    private final IRegistrarEntradaUseCase delegate;

    public TransactionalRegistrarEntradaUseCase(IRegistrarEntradaUseCase delegate) {
        this.delegate = delegate;
    }

    @Override
    @Transactional
    public MovimientoResponseDTO registrar(RegistrarEntradaDTO dto, Long idUsuario) {
        return delegate.registrar(dto, idUsuario);
    }
}

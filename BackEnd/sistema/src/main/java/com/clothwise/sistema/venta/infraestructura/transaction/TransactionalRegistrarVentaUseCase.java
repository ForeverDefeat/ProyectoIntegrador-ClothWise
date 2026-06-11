package com.clothwise.sistema.venta.infraestructura.transaction;

import com.clothwise.sistema.venta.aplicacion.dto.CrearVentaDTO;
import com.clothwise.sistema.venta.aplicacion.dto.VentaResponseDTO;
import com.clothwise.sistema.venta.aplicacion.ports.IRegistrarVentaUseCase;
import org.springframework.transaction.annotation.Transactional;

public class TransactionalRegistrarVentaUseCase implements IRegistrarVentaUseCase {

    private final IRegistrarVentaUseCase delegate;

    public TransactionalRegistrarVentaUseCase(IRegistrarVentaUseCase delegate) {
        this.delegate = delegate;
    }

    @Override
    @Transactional
    public VentaResponseDTO registrar(CrearVentaDTO dto, Long idUsuario) {
        return delegate.registrar(dto, idUsuario);
    }
}

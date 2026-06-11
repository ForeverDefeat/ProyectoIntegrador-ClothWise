package com.clothwise.sistema.venta.infraestructura.transaction;

import com.clothwise.sistema.venta.aplicacion.dto.VentaResponseDTO;
import com.clothwise.sistema.venta.aplicacion.ports.IAnularVentaUseCase;
import org.springframework.transaction.annotation.Transactional;

public class TransactionalAnularVentaUseCase implements IAnularVentaUseCase {

    private final IAnularVentaUseCase delegate;

    public TransactionalAnularVentaUseCase(IAnularVentaUseCase delegate) {
        this.delegate = delegate;
    }

    @Override
    @Transactional
    public VentaResponseDTO anular(Long idVenta, Long idUsuario) {
        return delegate.anular(idVenta, idUsuario);
    }
}

package com.clothwise.sistema.shared.infraestructura.transaction;

import com.clothwise.sistema.inventario.aplicacion.dto.RegistrarAjusteDTO;
import com.clothwise.sistema.inventario.aplicacion.dto.RegistrarEntradaDTO;
import com.clothwise.sistema.inventario.infraestructura.transaction.TransactionalRegistrarAjusteUseCase;
import com.clothwise.sistema.inventario.infraestructura.transaction.TransactionalRegistrarEntradaUseCase;
import com.clothwise.sistema.venta.aplicacion.dto.CrearVentaDTO;
import com.clothwise.sistema.venta.infraestructura.transaction.TransactionalAnularVentaUseCase;
import com.clothwise.sistema.venta.infraestructura.transaction.TransactionalRegistrarVentaUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionalUseCaseDecoratorsTest {

    @Test
    void casosDeUsoCriticosEstanAnotadosComoTransaccionales() throws NoSuchMethodException {
        assertThat(TransactionalRegistrarVentaUseCase.class
                .getMethod("registrar", CrearVentaDTO.class, Long.class)
                .isAnnotationPresent(Transactional.class)).isTrue();
        assertThat(TransactionalAnularVentaUseCase.class
                .getMethod("anular", Long.class, Long.class)
                .isAnnotationPresent(Transactional.class)).isTrue();
        assertThat(TransactionalRegistrarEntradaUseCase.class
                .getMethod("registrar", RegistrarEntradaDTO.class, Long.class)
                .isAnnotationPresent(Transactional.class)).isTrue();
        assertThat(TransactionalRegistrarAjusteUseCase.class
                .getMethod("ajustar", RegistrarAjusteDTO.class, Long.class)
                .isAnnotationPresent(Transactional.class)).isTrue();
    }
}

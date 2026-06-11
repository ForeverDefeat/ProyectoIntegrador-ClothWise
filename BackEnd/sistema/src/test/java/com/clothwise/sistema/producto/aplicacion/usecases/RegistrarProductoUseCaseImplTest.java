package com.clothwise.sistema.producto.aplicacion.usecases;

import com.clothwise.sistema.producto.aplicacion.dto.CrearProductoDTO;
import com.clothwise.sistema.producto.aplicacion.dto.VarianteResponseDTO;
import com.clothwise.sistema.producto.dominio.VarianteProducto;
import com.clothwise.sistema.producto.dominio.ports.IVarianteRepository;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class RegistrarProductoUseCaseImplTest {

    private final IVarianteRepository varianteRepository = mock(IVarianteRepository.class);
    private final RegistrarProductoUseCaseImpl useCase = new RegistrarProductoUseCaseImpl(varianteRepository);

    @Test
    void registraProductoConVariantesMediantePuertoDao() {
        when(varianteRepository.save(any(VarianteProducto.class))).thenAnswer(invocation -> {
            VarianteProducto variante = invocation.getArgument(0);
            variante.setId(100L);
            return variante;
        });
        CrearProductoDTO dto = new CrearProductoDTO(
                "Camisa Oxford",
                "Camisas",
                "OMG MODA",
                "https://cdn.example.com/camisa.webp",
                List.of(new CrearProductoDTO.VarianteDTO(
                        "M",
                        "Azul",
                        "Algodon",
                        BigDecimal.valueOf(45),
                        BigDecimal.valueOf(89.90)
                ))
        );

        List<VarianteResponseDTO> respuesta = useCase.registrar(dto);

        assertThat(respuesta).hasSize(1);
        assertThat(respuesta.get(0).idVariante()).isEqualTo(100L);
        assertThat(respuesta.get(0).nombreProducto()).isEqualTo("Camisa Oxford");
        assertThat(respuesta.get(0).imageUrl()).isEqualTo("https://cdn.example.com/camisa.webp");
        assertThat(respuesta.get(0).stockActual()).isZero();
        verify(varianteRepository).save(any(VarianteProducto.class));
    }
}

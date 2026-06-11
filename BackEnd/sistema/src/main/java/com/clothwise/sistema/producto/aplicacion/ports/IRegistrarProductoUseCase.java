package com.clothwise.sistema.producto.aplicacion.ports;

import com.clothwise.sistema.producto.aplicacion.dto.CrearProductoDTO;
import com.clothwise.sistema.producto.aplicacion.dto.VarianteResponseDTO;

import java.util.List;

/**
 * Input Port — contrato de orquestación para el registro de productos.
 * El controlador REST invoca este puerto sin conocer la implementación.
 */
public interface IRegistrarProductoUseCase {

    /**
     * Registra un producto nuevo con todas sus variantes iniciales.
     * @param dto datos validados del producto y sus variantes.
     * @return lista de variantes creadas con sus datos completos.
     */
    List<VarianteResponseDTO> registrar(CrearProductoDTO dto);
}

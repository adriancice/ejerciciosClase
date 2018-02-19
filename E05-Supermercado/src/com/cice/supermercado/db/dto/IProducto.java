package com.cice.supermercado.db.dto;

import com.cice.supermercado.business.enums.EnumCategorias;

public interface IProducto {

    String generarBaseCodigoProducto(EnumCategorias categoria);

    String generarCodigoProducto(String baseCodigoProducto);

}

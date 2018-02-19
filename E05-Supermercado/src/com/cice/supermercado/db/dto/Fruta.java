package com.cice.supermercado.db.dto;

import com.cice.supermercado.business.enums.EnumCategorias;

public class Fruta extends Producto {

    public Fruta(EnumCategorias categoria) {
        this.setCategoria(categoria);
        setCodigo(generarCodigoProducto(generarBaseCodigoProducto(categoria)));
    }



    @Override
    public String toString() {
        return "El codigo del producto es: " + getCodigo();
    }
}

package com.cice.supermercado.db.dto;

import com.cice.supermercado.business.enums.EnumCategorias;

public class Producto implements IProducto{

    private String codigo;
    private String nombre;
    private EnumCategorias categoria;
    private Long stockage;
    
    public Producto(String nombre, EnumCategorias categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
		setCodigo(generarCodigoProducto(generarBaseCodigoProducto(categoria)));
	}



	public Producto(String nombre, EnumCategorias categoria, Long stockage) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stockage = stockage;
        setCodigo(generarCodigoProducto(generarBaseCodigoProducto(categoria)));
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumCategorias getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategorias categoria) {
        this.categoria = categoria;
    }

    public Long getStockage() {
        return stockage;
    }

    public void setStockage(Long stockage) {
        this.stockage = stockage;
    }

    @Override
    public String generarBaseCodigoProducto(EnumCategorias categoria){
        String baseCodigoProducto = null;
        baseCodigoProducto = categoria.getCodigoPais().concat("_").concat(categoria.getBaseCodigo());
        return baseCodigoProducto;
    }

    /**
     * Metodo que me va a generar un codigo de 4 numeros dependiendo del nombre del producto
     * 1º - Nxxx donde N es el valor del codigo pais
     * 2º - xNxx donde N es la suma de los digitos de categoria -> 1901 -> 11 -> 2
     * 3º - xxNN donde NN es un numero aleatorio entre 0 y 99
     * @param baseCodigoProducto -> por ejemplo: 8_0001
     * @return
     */
    @Override
    public String generarCodigoProducto(String baseCodigoProducto){
    	StringBuilder codigoProducto = null;
        String[] datos = baseCodigoProducto.split("_");
        int aux = 0;
        int aux2 = 0;
        for (char c : datos[1].toCharArray()){
            aux += Integer.parseInt(String.valueOf(c));
            if(String.valueOf(aux).length() > 1){
                for (int d : String.valueOf(aux).toCharArray()){
                    aux2 += Integer.parseInt(String.valueOf(d));
                }
                aux = aux2;
            }
        }
        String random = String.valueOf(Math.round(Math.random() * 100));
        codigoProducto =  new StringBuilder(baseCodigoProducto).append("_").append(datos[0]).append(aux).append(random);
        return codigoProducto.toString();
    }
}

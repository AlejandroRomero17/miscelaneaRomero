package com.utxj.miscelanea.model;

public class producto {
    
    private long codigo_producto;
    private String nombre;
    private float precio_compra;
    private float precio_venta;
    private String categoria;
    private String proveedor;

    public producto(long codigo_producto, String nombre, float precio_compra, float precio_venta, String categoria, String proveedor) {
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public long getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(long codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}

package com.utxj.miscelanea.model;

public class venta {
    private long codigo_venta;
    private String fecha;
    private long codigo_empleado;
    private long codigo_producto;
    private float precio_producto;
    private String proveedor;

    public venta(long codigo_venta, String fecha, long codigo_empleado, long codigo_producto, float precio_producto, String proveedor) {
        this.codigo_venta = codigo_venta;
        this.fecha = fecha;
        this.codigo_empleado = codigo_empleado;
        this.codigo_producto = codigo_producto;
        this.precio_producto = precio_producto;
        this.proveedor = proveedor;
    }

    public long getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(long codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(long codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public long getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(long codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}

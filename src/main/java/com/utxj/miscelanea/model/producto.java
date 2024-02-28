package com.utxj.miscelanea.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class producto {
    
    private long codigo_producto;
    private String nombre;
    private float precio_compra;
    private float precio_venta;
    private String categoria;
    private String proveedor;
}

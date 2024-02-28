package com.utxj.miscelanea.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class venta {
    private long codigo_venta;
    private String fecha;
    private long codigo_empleado;
    private long codigo_producto;
    private float precio_producto;
    private String proveedor;
}

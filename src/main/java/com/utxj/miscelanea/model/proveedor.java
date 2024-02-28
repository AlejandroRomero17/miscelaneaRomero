package com.utxj.miscelanea.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class proveedor {

    private long codigo_proveedor;
    private String nombre;
    private String horario;
    private String empresa;
    private String domicilio;
    private String telefono;
}

package com.utxj.miscelanea.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class empleado {

    private long codigo_empleado;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String horario;
    private String puesto;
}

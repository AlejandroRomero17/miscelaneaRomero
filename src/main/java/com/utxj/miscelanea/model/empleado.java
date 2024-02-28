package com.utxj.miscelanea.model;

public class empleado {

    private long codigo_empleado;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String horario;
    private String puesto;

    public empleado(long codigo_empleado, String nombre, String apellido_paterno, String apellido_materno, String horario, String puesto) {
        this.codigo_empleado = codigo_empleado;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.horario = horario;
        this.puesto = puesto;
    }

    public long getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(long codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

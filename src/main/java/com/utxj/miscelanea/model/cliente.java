package com.utxj.miscelanea.model;

public class cliente {

    private long codigo_cliente;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String domicilio;
    private String telefono;

    public cliente(long codigo_cliente, String nombre, String apellido_paterno, String apellido_materno, String domicilio, String telefono) {
        this.codigo_cliente = codigo_cliente;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

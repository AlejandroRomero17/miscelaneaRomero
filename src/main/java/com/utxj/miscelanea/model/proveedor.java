package com.utxj.miscelanea.model;

public class proveedor {

    private long codigo_proveedor;
    private String nombre;
    private String horario;
    private String empresa;
    private String domicilio;
    private String telefono;

    public proveedor(long codigo_proveedor, String nombre, String horario, String empresa, String domicilio, String telefono) {
        this.codigo_proveedor = codigo_proveedor;
        this.nombre = nombre;
        this.horario = horario;
        this.empresa = empresa;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public long getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(long codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

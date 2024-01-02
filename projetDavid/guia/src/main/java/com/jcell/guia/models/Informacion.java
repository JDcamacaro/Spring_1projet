package com.jcell.guia.models;

// 1* generamos clase modelo con sus  atributos
public class Informacion {

    private int cedula ;

    private String nombre;

    private String apellido;

    private Direccion direccion;

    //2* contructor vacio
    public Informacion(){

    }

    // 3* generar geter a seter
    public int getCedula(){
        return cedula;
    }

    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

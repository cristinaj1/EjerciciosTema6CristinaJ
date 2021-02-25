/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

/**
 *
 * @author Cris
 */
public class Persona {

    protected String nombre;
    protected String apelllidos;

    public Persona(String nombre, String apelllidos) {
        this.nombre = nombre;
        this.apelllidos = apelllidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllidos() {
        return apelllidos;
    }

    public void setApelllidos(String apelllidos) {
        this.apelllidos = apelllidos;
    }

}

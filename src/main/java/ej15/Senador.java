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
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apelllidos) {
        super(provincia, partidoPolitico, nombre, apelllidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
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

    @Override
    public void getCamara() {
        System.out.println("Tiene la posición de Senador");
    }

    @Override
    public String toString() {
        return "Senador{" + "complemento=" + complemento + '}';
    }
}

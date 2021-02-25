/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

/**
 *
 * @author Cris
 */
public class Maitre extends Trabajador {

    private String codTrabajador;

    public Maitre(String codTrabajador, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.codTrabajador = codTrabajador;
    }

    
    @Override
    public void cotizar() {
        System.out.println("Cotizando como Maître");
    }

    public void servirVino() {
        System.out.println("Objeto Maître: Sirviendo vino");
    }

}

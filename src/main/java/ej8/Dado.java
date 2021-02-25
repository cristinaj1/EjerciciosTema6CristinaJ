/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Dado extends Azar{
    Random numero = new Random ();

    @Override
    public int lanzar() {
        int aleatorio= numero.nextInt(6)+1;
        return aleatorio;
    }
    public static void main(String[] args) {
        Dado prueba = new Dado();

        System.out.println("El numero aleatorio del dado es " + prueba.lanzar());

    }
    
}

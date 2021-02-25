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
public class Moneda extends Azar {

    Random numero = new Random();

    @Override
    public int lanzar() {
        int aleatorio = numero.nextInt(2) + 1;
        return aleatorio;
    }

    public static void main(String[] args) {
        Moneda prueba = new Moneda();

        System.out.println("El numero aleatorio de la moneda es " + prueba.lanzar());

    }

}

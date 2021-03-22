/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Cris
 */
public class Prueba {

    // Busca al robot y lo ordena.
    private static int buscarRobotBinario(Robot a, ArrayList array) {
        Comparator<Robot> criterioSerie = (v1, v2) -> v1.getNumeroSerie() - (v2.getNumeroSerie());
        return Collections.binarySearch(array, a, criterioSerie);
    }

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Robot> lista = new ArrayList<>();
        ArrayList<Robot> listaBateria = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(new Robot(random.nextInt(100), random.nextInt(100)));
        }

        //Creo un robot para buscarlo.
        Robot prueba = new Robot(random.nextInt(100), random.nextInt(100));

        //Por porcentaje
        System.out.println("");
        System.out.println("-----------------De menor a mayor---------");
        Collections.sort(lista);
        lista.forEach(System.out::println);

        //A la inversa
        System.out.println("");
        System.out.println("-----------------De mayor a menor--------------");
        Collections.reverse(lista);
        lista.forEach(System.out::println);

        for (Robot r : lista) {
            if (r.getPorcentajeVida() > 50) {
                listaBateria.add(r);

            }
        }

        //Imprime los que tienen más del 50%
        System.out.println("");
        System.out.println("--------------Los de más de un 50% de batería--------");
        listaBateria.forEach(System.out::println);

        //Organizar por numero de serie
        //Buscamos la prueba de robot, primero lo añadimos
        lista.add(prueba);
        System.out.println("");
        System.out.println("--------------Busqueda del robot----------");

        //Buscar robot
        try {
            //La excepción es por el get
            System.out.println(lista.get(buscarRobotBinario(prueba, lista)));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se encuentra en el array el robot");
        }

    }
}

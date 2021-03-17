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

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Robot> lista = new ArrayList<>();
        ArrayList<Robot> listaBateria = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            lista.add(new Robot(random.nextInt(100), random.nextInt(100)));
        }

        //Por porcentaje(no me funciona ninguno)
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
        
        
        //Preguntar a alguien mañana
//        Collections.sort(lista,(v1,v2)->v1.getNumeroSerie().compareTo(v2.getNumeroSerie());
//       Comparator<Robot> criterioNumero= (v1,v2)->v1.getNumeroSerie().compareTo(v2.getNumeroSerie());
    }

}

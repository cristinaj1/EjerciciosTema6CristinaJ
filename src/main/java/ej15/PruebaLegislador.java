/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class PruebaLegislador {

    public static void main(String[] args) {
        ArrayList<Legislador> legisladores = new ArrayList<>();
        legisladores.add(new Diputado(5, "Malaga", "Pozoe", "Antonio", "Bellido"));
        legisladores.add(new Senador(2, "Sevilla", "Voxito", "Manuel", "Costa"));
        for (Legislador f : legisladores) {
            System.out.println("Los representantes son: " + f.getCamara());
            if (f instanceof Diputado) {
                ((Diputado) f).getNumeroAsiento();
            }
            if (f instanceof Senador) {
                ((Senador) f).getComplemento();
            }
        }
    }
}

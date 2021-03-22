/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

/**
 *
 * @author Cris
 */
public class Robot implements Comparable<Robot> {

    private int numeroSerie;
    private int porcentajeVida;

    public Robot(int numeroSerie, int porcentajeVida) {
        this.numeroSerie = numeroSerie;
        this.porcentajeVida = porcentajeVida;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public String toString() {
        return "Robot{" + "numeroSerie=" + numeroSerie + ", porcentajeVida=" + porcentajeVida + '}';
    }

    @Override
    public int compareTo(Robot r) {
        return (int) (this.getPorcentajeVida() - r.porcentajeVida);
    }

}

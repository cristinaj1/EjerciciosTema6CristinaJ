/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

/**
 *
 * @author Cris
 */
public class Campana extends Electrodomestico {

    private double decibelios;

    public Campana(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        this.decibelios = decibelios;
    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "Campana{" + "decibelios=" + decibelios + '}';
    }

}

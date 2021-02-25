/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

/**
 *
 * @author Cris
 */
public abstract class Vehiculo {

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
    //a) Podría tener descedencia debido a que 
    //los atributos pueden ser cumplido por sus descendientes sin problema alguno

    //b)Si es referente a vehículos terrestres únicamente, entonces sí 
    //podría hacerse, en cambio,  si en vehículos entran aviones ya solo 
    //vandría el de velocidad no el del bastidor
}

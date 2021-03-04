/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

import ej15.Persona;

/**
 *
 * @author cristina
 */
public class Prueba {
    public static void main(String[] args) {
        Cuenta prueba1 = new CuentaAhorro(1.5, 3.5, "888888804", 356.21, new Persona ("Antonia", "Marín", "8888874G"));
        Cuenta prueba2 = new CuentaCorriente(1.5, 20, "88040000001", 2100, new Persona ("Jose Antonio", "De Hoyos", "48877416H"));
        prueba1.retirar(300);
        prueba1.actualizarSaldo();
        prueba2.retirar(1000);
        prueba2.actualizarSaldo();
    }
    
}

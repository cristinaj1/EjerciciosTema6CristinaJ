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
public class CuentaCorriente extends Cuenta {

    private double interes;
    private double saldoMin;

    public CuentaCorriente(double interes, double saldoMin, String numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.interes = 1.5;
        this.saldoMin = saldoMin;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public void retirar(double a) {
        if (a > saldoMin) {
            System.out.println("Puede retirar su dinero correctamente");
        } else if (a > 1000) {
            double resultado = saldo -(saldo + (saldoMin * interes));
        } else if (a < 1000 && a > saldoMin) {
            double dinero = saldo - (saldo + (saldo + interes));
        } else {
            System.out.println("No tiene saldo suficiente");
        }
    }

    @Override
    public void actualizarSaldo() {
        System.out.println("Ahora mismo tiene " + saldo + "€");
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }
    

}

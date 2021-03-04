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
public class CuentaAhorro extends Cuenta {

    protected double interes;
    protected double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, String numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public void retirar(double a) {
        if (a > (saldo-a)) {
            System.out.println("Puede retirar su dinero correctamente");
        } else {
            System.out.println("No tiene suficiente saldo");
        }
    }

    @Override
    public void actualizarSaldo() {
        double resultadoInteres = saldo - ((saldo + (saldo * interes)) - comisionAnual);
        System.out.println("Su saldo es de: " + resultadoInteres + "€");
    }

}

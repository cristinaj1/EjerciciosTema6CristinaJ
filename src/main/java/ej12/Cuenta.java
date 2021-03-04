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
public abstract class Cuenta {

    protected String numeroCuenta;
    protected double saldo;
    protected Persona cliente;

    public Cuenta(String numeroCuenta, double saldo, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Cuenta() {
        numeroCuenta = "0000000001";
        saldo = 0;
        cliente = cliente;
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
    
    public abstract void retirar(double saldo);
    public abstract void actualizarSaldo();

}

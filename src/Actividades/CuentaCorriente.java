package Actividades;

import java.text.NumberFormat;
import java.util.Locale;

public class CuentaCorriente {
    private String dni;
    private String titular;
    private double saldo;

    public CuentaCorriente(String dni, String titular, double saldo) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String titular) {
        this(dni, titular, 0);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo);
    }

    public void sacarDinero(double valor) {
        if(saldo > 0 && valor <= saldo)
            saldo -= valor;
        else
            System.out.println("Saldo insuficiente");
    }

    public void ingresarDinero(double valor) {
        saldo += valor;
        System.out.println(valor + " ingresado.");
    }

    public void mostrarInformacion(){
        System.out.println("DNI: " + this.dni
                        + "\nTitular: " + this.titular
                        + "\nSaldo: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(saldo));
    }
}

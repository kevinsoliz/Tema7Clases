package Actividades;

import java.text.NumberFormat;
import java.util.Locale;

public class CuentaCorriente {
    String dni;
    public String titular;
    private double saldo;
    private static String banco;
    private Gestor gestor;

    public CuentaCorriente(String dni, String titular, double saldo, Gestor gestor) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    public CuentaCorriente(String dni, String titular) {
        this(dni, titular, 0, null);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo, null);
    }

    public void sacarDinero(double valor) { // profe lo hizo con boolean
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
                        + "\nSaldo: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(saldo)
                        + "\nGestor: " + gestor.nombre);
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public static String getBanco() {
        return banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}

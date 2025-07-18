package Ejercicio10.Maquinaria;

import Ejercicio10.Personal.Mecanico;

import java.util.Date;

public class Locomotora {
    private final String MATRICULA;
    private int potencia;
    private Date anioFabricacion;
    private Mecanico mecanico;

    public Locomotora(String MATRICULA, int potencia, Date anioFabricacion,  Mecanico mecanico) {
        this.MATRICULA = MATRICULA;
        setPotencia(potencia);
        setAnioFabricacion(anioFabricacion);
        this.mecanico = mecanico;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}

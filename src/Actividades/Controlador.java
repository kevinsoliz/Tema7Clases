package Actividades;

public class Controlador {
    private double frecuencia;

    public Controlador() {
        frecuencia = 80;
    }

    public void up(){
        frecuencia += 0.5;
        if (frecuencia > 108)
            frecuencia = 80;
    }

    public void down(){
        frecuencia -= 0.5;
        if (frecuencia < 80)
            frecuencia = 108;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
}

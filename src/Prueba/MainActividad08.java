package Prueba;

import Actividades.Controlador;

public class MainActividad08 {
    public static void main(String[] args) {
        var controlador = new Controlador();
        controlador.up();
        controlador.down();
        controlador.down();

        System.out.println(controlador.getFrecuencia());
    }
}

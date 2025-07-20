package Practica.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        var fecha = new Calendario(29, 2, 2025);
        fecha.mostrar();
        var fecha2 = new Calendario(2, 3, 2025);
        System.out.println(fecha.iguales(fecha2));
        fecha.incrementarMes();
        fecha.mostrar();

    }
}

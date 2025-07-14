package Prueba;

import Actividades.Hora;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainActividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora: ");
        int hora = sc.nextInt();
        System.out.print("Minuto: ");
        int minuto = sc.nextInt();
        System.out.print("Segundo: ");
        int segundo = sc.nextInt();
        System.out.print("n: ");
        byte n = sc.nextByte();

        var hor = new Hora(hora, minuto, segundo);

        for(int i = 0; i < n; i++){
            hor.actualizarHora();
            System.out.printf("%02d:%02d:%02d\n", hor.getHora(), hor.getMinuto(), hor.getSegundo());
        }

    }
}

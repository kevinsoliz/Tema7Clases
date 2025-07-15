package Prueba;

import Actividades.Texto;

public class MainActividad07 {
    public static void main(String[] args) {
        var texto = new Texto((byte)50);
        String cadena = "Heollo ajdjapjfiqejrtierqjfklajklfjlkjhkjhlkjhlkjh";
        texto.addFinal(cadena);
        texto.addPrincipio("hey moni ");
        byte vocales = texto.contarVocales();
        texto.mostrarInfo();
        System.out.println("Vocales: " + vocales);
        System.out.println(cadena.length());
    }
}

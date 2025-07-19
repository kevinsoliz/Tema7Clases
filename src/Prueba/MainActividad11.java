package Prueba;

import Actividades.Lista;

public class MainActividad11 {
    public static void main(String[] args) {
        var lista = new Lista();
        lista.insertarPrincipio(4);
        lista.insertarPrincipio(5);
        lista.insertarPrincipio(6);
        lista.insertarPrincipio(7);
        System.out.println(lista);
        lista.insertarFinal(8);
        lista.insertarFinal(9);
        lista.insertarFinal(10);
        System.out.println(lista);
        System.out.println(lista.getNumElementos());
        lista.insertarIndice((byte)3, 2);
        System.out.println(lista);

        var lista2 = new Lista();
        lista2.insertarPrincipio(44);
        lista2.insertarPrincipio(53);
        lista.insertarLista(lista2);
        System.out.println(lista);

        System.out.println(lista.obtenerIndice(6));

        lista.eliminarElemento(2);
        System.out.println(lista);
    }
}

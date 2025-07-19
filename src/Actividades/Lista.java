package Actividades;

import java.util.Arrays;

public class Lista {
    private Integer elemento;
    private Integer[] lista;

    public Lista() {
        lista = new Integer[0];
    }

    public int getNumElementos() {
        return lista.length;
    }

    public void insertarFinal(Integer elemento) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = elemento;
    }

    public void insertarPrincipio(Integer elemento) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, 0, lista, 1, lista.length - 1);
        lista[0] = elemento;
    }

    public void insertarIndice(byte indice,  Integer elemento) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, indice, lista, indice + 1, lista.length - indice - 1);
        lista[indice] = elemento;
    }

    public void insertarLista(Lista otra){
        int longitud = getNumElementos();
        lista = Arrays.copyOf(lista, getNumElementos() + otra.getNumElementos());
        System.arraycopy(otra.lista, 0, lista, longitud, otra.getNumElementos());
//        for(int i = 0; i < otra.getNumElementos(); i++){
//            insertarFinal(otra.obtenerElemento((byte)i));
//        }
    }

    public void eliminarElemento(int indice) {
//        int indice = Arrays.binarySearch(lista, elemento); para listas ordernadas solamente
//        if (indice >= 0) {
//            indice = indice - 1;
//            System.arraycopy(lista, indice + 1, lista, indice , lista.length - indice - 1 );
//        }
        System.arraycopy(lista, indice + 1, lista, indice, getNumElementos() - indice - 1);
        lista = Arrays.copyOf(lista, lista.length - 1);
    }

    public Integer obtenerElemento(byte indice){
        return lista[indice];
    }

    public int obtenerIndice(Integer elemento){
        int indice = -1;
        for (int i = 0; i < lista.length; i++){
            if (lista[i] == elemento){
                indice = i;
            }
        }
        return indice;
    }

    @Override
    public String toString() {
        return "Lista: " + Arrays.toString(lista);
    }
}

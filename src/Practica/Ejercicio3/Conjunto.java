package Practica.Ejercicio3;

import Actividades.Lista;

public class Conjunto {
    private Lista conjunto;

    public Conjunto(){
        conjunto = new Lista();
    }

    public int numeroElementos(){
        return conjunto.getNumElementos();
    }

    public boolean insertar(Integer nuevo){
        boolean insertado = false;
        if(!pertenece(nuevo)){
            conjunto.insertarFinal(nuevo);
            insertado = true;
        }
       return insertado;
    }

    public boolean insertar(Conjunto otroConjunto){
        boolean insertado = false;
        int longitudAnterior = numeroElementos();
        if(!iguales(otroConjunto)) {
            for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
                insertar(otroConjunto.conjunto.obtenerElemento((byte) i));
            }
            insertado = true;
        }
        return insertado;

    }

    public boolean eliminarElemento(Integer elemento){
        boolean eliminado = false;
        if(pertenece(elemento)){
            int indice = conjunto.obtenerIndice(elemento);
            conjunto.eliminarElemento(indice);
            eliminado = true;
        }
        return eliminado;
    }

    public boolean eliminarConjunto(Conjunto otroConjunto){
        boolean eliminado = false;
        if(!iguales(otroConjunto)) {
            for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
                eliminarElemento(otroConjunto.conjunto.obtenerElemento((byte) i));
            }
            eliminado = true;
        }
        return eliminado;
    }

    public boolean pertenece(Integer elemento){
        boolean existe = false;
        for(int i = 0; i < numeroElementos(); i++){
            if(conjunto.obtenerElemento((byte)i) == elemento)
                existe = true;
        }
        return existe;
    }

    public void muestra(){
        System.out.println("Conjunto: " + conjunto.toString());
    }

    public boolean iguales(Conjunto otroConjunto){
        boolean iguales = false;
        int contador = 0;
        Integer elemento;

        do {
            elemento = conjunto.obtenerElemento((byte) contador);
            contador++;
        } while (contador < numeroElementos() && otroConjunto.pertenece(elemento)); //Había que buscar los elementos del primer conjunto en el segundo.

        if (contador == numeroElementos())
            iguales = true;

        return iguales;
    }
}

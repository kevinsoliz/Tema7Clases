package Practica.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        var conjunto = new Conjunto();
        conjunto.insertar(3);
        conjunto.insertar(4);
        conjunto.insertar(5);
        conjunto.insertar(6);
        conjunto.insertar(7);
        //conjunto.muestra();
        var conjunto2 = new Conjunto();
        conjunto2.insertar(2);
        conjunto2.insertar(33);
        conjunto2.insertar(55);
        conjunto2.insertar(66);
        conjunto2.insertar(77);

        conjunto.insertar(conjunto2);
//        conjunto.muestra();
//        System.out.println("Eliminar");
//        System.out.println(conjunto.iguales(conjunto2));
//        conjunto.eliminarConjunto(conjunto2);
//        conjunto.muestra();
//        conjunto2.muestra();
//        System.out.println(Conjunto.incluido(conjunto, conjunto2));
        conjunto.muestra();
        conjunto2.muestra();
        System.out.println(Conjunto.incluido(conjunto, conjunto2));
        System.out.println(Conjunto.incluido(conjunto2, conjunto));

    }
}

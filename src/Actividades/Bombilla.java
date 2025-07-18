package Actividades;

public class Bombilla {
    private boolean encendida;
    private static boolean generalEncendido;

    public Bombilla() {
        generalEncendido = true;
        apagar();
    }

    public void encender(){
        encendida = true;
    }

    public void apagar(){
        encendida = false;
    }

    public boolean estado(){
        return encendida && generalEncendido;
    }

    public static void apagarGeneral(){
        generalEncendido = false;
    }

    public static void encenderGeneral(){
        generalEncendido = true;
    }
}

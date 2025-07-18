package Ejercicio10.Personal;

public class Maquinista {
    private String nombre;
    final private String DNI;
    private String rango;

    public Maquinista(String nombre, String DNI, String rango) {
        setNombre(nombre);
        this.DNI = DNI;
        setRango(rango);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}

package Actividades;

public class Gestor {
    public String nombre;
    private String telefono;
    double importeMax;

    public Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10_000);
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre
                        + "\nTelefono: " + this.telefono
                        + "\nImporte Max: " + this.importeMax);
    }
}

package Ejercicio10.Personal;

public class Mecanico {
    private String nombre;
    private int telefono;
    private Especialidad especialidad;

    public Mecanico(String nombre, int telefono, Especialidad especialidad) {
        setNombre(nombre);
        setTelefono(telefono);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}

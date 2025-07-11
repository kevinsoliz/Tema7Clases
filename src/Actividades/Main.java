package Actividades;

public class Main {
    public static void main(String[] args) {
        var cuenta1 = new CuentaCorriente("2334", 300);
        cuenta1.mostrarInformacion();
        cuenta1.dni = "2332";
        CuentaCorriente.setBanco("Santando");
    }
}

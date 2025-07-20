package Practica.Ejercicio1;

public class Calendario {
    private int anio;
    private final int[] MESES = {31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int dia;
    private int mes;

    public Calendario(int dia, int mes, int anio) {
        if (dia <= MESES[mes - 1]) {
            this.anio = anio;
            this.dia = dia;
            this.mes = mes;
        }
        else {
            this.anio = 1;
            this.dia = 1;
            this.mes = 1;
        }
    }

    public void incrementarDia(){
        dia++;
        if(dia > MESES[mes - 1]) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes(){
        mes++;
        if(mes > 12) {
            mes = 1;
            anio++;
        }
    }

    public void incrementarAnio(int cantidad){
        if(cantidad > 0)
            anio += cantidad;
    }

    public boolean iguales(Calendario otraFecha){
        return this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    public void mostrar(){
        System.out.printf("%02d-%02d-%02d", dia, mes, anio);
    }
}

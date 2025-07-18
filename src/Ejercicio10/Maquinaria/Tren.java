package Ejercicio10.Maquinaria;

import Ejercicio10.Personal.Maquinista;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = new Vagon[5];
        this.maquinista = maquinista;
    }

    public void addVagon(Vagon vagon) {
        byte indice = 0;
        if(vagones.length <= 5) {
            vagones[indice] = vagon;
            indice++;
        }
    }
}

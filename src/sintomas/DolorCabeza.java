package sintomas;

import clases.Remedios;

public class DolorCabeza implements Remedios {
    private final String dolorDeCabeza = "Dolor de cabeza";

    public void medicamentos() {
        System.out.println(dolorDeCabeza +": "+ "Paracetamol");
    }

    public void remedio_alternativo() {
        System.out.print(" o comer algo dulce\n");
    }
}
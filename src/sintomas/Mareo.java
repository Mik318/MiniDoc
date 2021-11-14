package sintomas;

import clases.Remedios;

public class Mareo implements Remedios{
    private final String sintoma = "Mareo";

    public void medicamentos() {
        System.out.println(sintoma +": "+ "Dramamine");
    }

    public void remedio_alternativo() {
        System.out.print("o Inhalar un poco de alcohol \n");
    }
}

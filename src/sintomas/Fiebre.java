package sintomas;

import clases.Remedios;

public class Fiebre implements Remedios{
    private final String sintoma = "Fiebre";

    public void medicamentos() {
        System.out.println(sintoma + ": " + "Paracetamol ");
    }

    public void remedio_alternativo() {
        System.out.print("o Fomentos de agua fría \n");
    }
}

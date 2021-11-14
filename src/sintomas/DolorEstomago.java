package sintomas;

import clases.Remedios;

public class DolorEstomago implements Remedios {
    private final String sintoma = "Dolor de estomago";

    public void medicamentos() {
        System.out.println(sintoma + ": " + "Buscapina");
    }

    public void remedio_alternativo() {
        System.out.print("o Té de hierbabuena\n");
    }
}

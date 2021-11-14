package sintomas;

import persona.Persona;

public class sintomatologia extends Persona {

    DolorCabeza dolorCabeza;
    DolorEstomago dolorEstomago;
    Fiebre fiebre;
    Mareo mareo;

    public sintomatologia(String name, int age) {
        super(name, age);
    }

    public void data(){
        dolorCabeza = new DolorCabeza();
        dolorEstomago = new DolorEstomago();
        fiebre = new Fiebre();
        mareo = new Mareo();

        System.out.println(getName() + " estos son los remedios para los posibles sintomas:");  
        fiebre.medicamentos();
        fiebre.remedio_alternativo();
        dolorEstomago.medicamentos();
        dolorEstomago.remedio_alternativo();
        dolorCabeza.medicamentos();
        dolorCabeza.remedio_alternativo();
        mareo.medicamentos();
        mareo.remedio_alternativo();
    }
}

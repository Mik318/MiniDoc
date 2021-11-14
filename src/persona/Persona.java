package persona;

import clases.Paciente;

public class Persona extends Paciente{

    public Persona(String name, int age) {
        super(name, age);
    }

    @Override
    public String showData() {
        return "Persona{" + "name=" + getName() + ", age=" + getAge() + '}';
    }
    
}

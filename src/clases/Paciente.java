package clases;

public abstract class Paciente {
    private String name;
    private int age;

    public Paciente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String showData();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

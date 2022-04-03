package lesson19.game;

public abstract class Participant {

    protected String name;
    protected Integer age;

    public Participant(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

package lesson_6;

public class Cat extends Animal {
    protected String name;
    protected int jump;

    public Cat(String name, int runDist, int swimDist, float jumpDist) {
        super(name, runDist, swimDist, jumpDist);
        this.name = name;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " " +);
    }
}



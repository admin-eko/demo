package lesson_6;

public class Dog extends Animal {
    protected String name;
    protected int swim;

    public Dog(String name, int runDist, int swimDist, float jumpDist, String name1, int swim) {
        super(name, runDist, swimDist, jumpDist);
        this.name = name1;
        this.swim = swim;
    }
}
}
}


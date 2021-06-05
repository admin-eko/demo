package lesson_6;

public class Animal {
    protected  String name;
    protected final int runDist;
    protected final int swimDist;
    protected final float jumpDist;

    public Animal(String name, int runDist, int swimDist, float jumpDist) {
        this.name = name;
        this.runDist = runDist;
        this.swimDist = swimDist;
        this.jumpDist = jumpDist;
    }
}

    void Animal() {
    }

     void Cat() {
        if (runDist > 0) System.out.println("Кот " + name + "прыгает на" + runDist + "метров");
                } else {
        System.out.println("Кот " + name + "не может прыгать на " + runDist + "метров");
    }
    void  Cat() {
        if (swimDist == true)  System.out.println("Кот " + name + "не плавает" );
    } else {
        System.out.println("Кот " + name + "плавает на " + swimDist + "метров");
    }

    public static void main(String[] args) {
    Animal animal = new Animal();
    Cat cat  = new Cat("Барсик", 1- );
    animal

    }
}

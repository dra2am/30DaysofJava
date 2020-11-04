package AnimalClass;

public class Main {
    public static void main(String[] args) {
        // init classes
        Dog fido = new Dog("Yorkie", 10, 1, 4, 20, "medium");
        Fish goldie = new Fish("Gold fish", 1, 1, 2, 4);
        // we can use methods from Animal class
        fido.eat();
        fido.run();
        goldie.swim();

    }
}

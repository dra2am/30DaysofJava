package AnimalClass;

//extends allows us to use behavior defined in animal class in dog
public class Dog extends Animal {
    // can define our own variables
    private int legs;
    private int tail;
    private String coat;

    // constructor using animal class params
    public Dog(String name, int weight, int legs, int tail, int teeth, String coat) {
        // super: calls constructor from Animal
        // defaulted size
        super(name, 1, weight);
        // initialize other vars
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    // we can assign unique methods for this class
    private void chew() {
        System.out.println("Dog's chew called");
    }

    // we can override methods too
    @Override
    public void eat() {
        System.out.println("Dog's eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog's walk called");
        move(5);
    }

    public void run() {
        System.out.println("Dog's run called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog's moveLegs called. Moving at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog's move called");
        moveLegs(speed);
        // this will call move from the super class, not from Dog
        super.move(speed);
    }
}

package AnimalClass;

public class Animal {
    private String name;
    private int size;
    private int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("Eat called from Animal");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }
}

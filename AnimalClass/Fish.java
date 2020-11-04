package AnimalClass;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int fins) {
        super(name, size, weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveFins() {
        System.out.println("Fins moving");
    }

    public void swim() {
        moveFins();
        super.move(5);
    }

}

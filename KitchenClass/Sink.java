package KitchenClass;

public class Sink {
    private String brand;
    private int faucets;

    public Sink(String brand, int faucets) {
        this.brand = brand;
        this.faucets = faucets;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getfaucets() {
        return this.faucets;
    }

    public void turnOn() {
        System.out.println("Sink-> sink is running");
    }
}

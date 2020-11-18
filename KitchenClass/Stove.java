package KitchenClass;

public class Stove {
    private int burners;
    private String brand;
    private Oven oven;

    public Stove(int burners, String brand, Oven oven) {
        this.burners = burners;
        this.brand = brand;
        this.oven = oven;
    }

    public int getBurners() {
        return this.burners;
    }

    public String getBrand() {
        return this.brand;
    }

    public Oven getOven() {
        return this.oven;
    }

    public void turnOn() {
        System.out.println("Stove-> stove is on");
    }

}

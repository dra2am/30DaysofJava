package KitchenClass;

public class Oven {
    private String brand;
    private int temp;

    public Oven(String brand, int temp) {
        this.brand = brand;
        this.temp = temp;
    }

    public String getBrand() {
        System.out.println("Oven brand is " + brand);
        return brand;
    }

    public int getTemp() {
        System.out.println("Current temp is " + temp);
        return temp;
    }

    public void turnOn() {
        System.out.println("Oven -> Oven is on");
    }

    public int setTemp(int newTemp) {
        this.temp = newTemp;
        System.out.println("Set oven to " + temp);
        return temp;
    }

}

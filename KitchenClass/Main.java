package KitchenClass;

//Composition...
public class Main {
    public static void main(String[] args) {
        // objects to be passed to kitchen
        Sink sink1 = new Sink("cool brand", 2);
        Stove stove1 = new Stove(4, "cool brand", new Oven("cool brand", 340));
        // kitchen init with objects
        Kitchen kitchen = new Kitchen("cool kitchen", stove1, sink1);
        // turn on sink from kitchen class
        kitchen.onSink();
        // turn on sink from getter
        kitchen.getSink().turnOn();
        // accessing oven methods
        kitchen.getStove().getOven().getBrand();
        kitchen.getStove().getOven().setTemp(400);
    }
}

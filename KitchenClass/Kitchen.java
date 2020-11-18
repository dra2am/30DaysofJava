package KitchenClass;

public class Kitchen {
    private String name;
    private Stove stove;
    private Sink sink;

    public Kitchen(String name, Stove stove, Sink sink) {
        this.name = name;
        this.stove = stove;
        this.sink = sink;
    }

    public String getName() {
        return name;
    }

    public Stove getStove() {
        return this.stove;
    }

    public Sink getSink() {
        return this.sink;
    }

    public void onSink() {
        System.out.println("Kitchen-> Sink is running");
        sink.turnOn();
    }
}

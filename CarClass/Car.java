package CarClass;

public class Car {
    // private, only to be accessed in this class
    // private int doors;
    // private int wheels;
    private String model;
    // private String engine;
    // private String color;

    // public setter, can be used in other classes
    public void setModel(String model) {
        // only accept carrera or commodore
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            // this refers to private int model
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter
    public String getModel() {
        return this.model;
    }

}

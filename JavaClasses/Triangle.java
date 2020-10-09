package JavaClasses;

//This is the class, contains properties and methods
public class Triangle {
    // static class var
    static int numOfSides = 3;
    // instance vars
    double base;
    double height;
    double sideOne;
    double sideTwo;
    double sideThree;

    // constructor method
    public Triangle(double base, double height, double sideOne, double sideTwo, double sideThree) {
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    // instance method
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}

package JavaClasses;

public class Main {
    public static void main(String[] args) {
        // isntances of Triangle class
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        // Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        // using an instance method
        double triangleArea = triangleA.findArea();
        System.out.println(triangleArea);
    }
}

public class salaryCalc {
    public static double salary(double hours, double pay, double weeks) {
        double yearly = hours * pay * weeks;
        return yearly;
    }

    public static void main(String[] args) {
        System.out.println(salary(40, 20, 52));
    }
}


class Calculator {
    // Adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Adding two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of two integers: " + calculator.add(6, 10));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.7));
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    // main

    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw(); // Calls the draw method in Circle class
    }
}

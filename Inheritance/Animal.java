
// Parent class or Base class
class Animal {
    public void eat() {
        System.out.println("This animal is eating");
    }
}

// Child class or derivied class
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Dog's own method
    }
}



// Encapsulation

import java.util.*;

class Car {
    String brand;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public void displayCarInfo() {
        System.out.println("Car: " + brand + ", Speed: " + speed);
    }

    // main function

    public static void main(String[] args) {
        Car car = new Car("Toyota", 120);
        car.displayCarInfo();
        car.setSpeed(150);
        car.displayCarInfo(); 
    }

}

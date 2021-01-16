package project;

public class CarManager {
    public static void main(String args[]) {
        Car dogCar = new Car();
        Car cowCar = new Car();
        
        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}

class Car {
    int speed;
    int distance;
    String color;
    
    public Car() {
        
    }
    public void speedUp() {
        speed = speed + 5;
    }
    public void breakDown() {
        speed = speed - 10;
    }
    public int getCurrentSpeed() {
        return speed;
    }
}

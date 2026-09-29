class Vehicle {
    public void forward() {
        System.out.println("The vehicle moves forward.");
    }

    public void reverse() {
        System.out.println("The vehicle moves backward.");
    }
}

class SUV extends Vehicle {
    @Override
    public void forward() {
        System.out.println("The SUV moves forward on a trail.");
    }

    @Override
    public void reverse() {
        System.out.println("The SUV backs out of a parking space.");
    }
}

class sportsCar extends Vehicle {
    @Override
    public void forward() {
        System.out.println("The sports car moves forward on the track.");
    }

    @Override
    public void reverse() {
        System.out.println("The sports car backs into the garage.");
    }
}

class Hybrid extends Vehicle {
    @Override
    public void forward() {
        System.out.println("The hybrid moves forward down the street.");
    }

    @Override
    public void reverse() {
        System.out.println("The hybrid backs out of the driveway.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new SUV(),
            new sportsCar(),
            new Hybrid()
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.forward();
            vehicle.reverse();
        }
    }
}

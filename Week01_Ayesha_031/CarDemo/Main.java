public class Main {

    public static void main(String[] args) {

        // Creating two Car objects
        Car bmw = new Car();
        Car tesla = new Car();

        // Setting details
        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        // BMW actions
        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.horn();

        // Tesla actions
        tesla.startEngine();
        tesla.drive();
        tesla.moveLeft();
        tesla.moveSlow();

        // Display both cars
        System.out.println("===== BMW =====");
        bmw.displayState();

        System.out.println("===== TESLA =====");
        tesla.displayState();

        // Stop BMW
        bmw.stopEngine();

        System.out.println("===== BMW After Stop =====");
        bmw.displayState();
    }
}
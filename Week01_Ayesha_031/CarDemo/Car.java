public class Car {
    private String brand ;
    private String color ;
    private int speed ;
    private boolean engineOn;
    private int fuelLevel ;
    private int gear ;


    public Car(){
        brand = "Unknown" ;
        color = "white" ;
        speed = 0 ;
        engineOn = false ;
        fuelLevel = 100 ;
        gear = 0 ;

    }

    public void setDetails (String brand , String color ){
        this.brand = brand ;
        this.color = color ;

    }
     // Start engine 
     public void startEngine(){
        engineOn = true ;
        System.out.println(brand + " engine started");
     }

     //stop engine
     public void stopEngine(){
        speed = 0 ;
        engineOn = false ;
        System.out.println(brand + " engine stopped");
     }
     //drive
      public void drive(){
        if(engineOn){
            speed = 40 ;
            System.out.println(brand + "is driving");
        }
        else{
            System.out.println("Start the engine first");
        }
      }
       //Move fast
       public  void moveFast(){
        if (engineOn) {
            speed += 30;
            System.out.println(brand + " is moving fast.");
        }
       }
        // Move SLow 
       public void moveSlow() {
        if (speed > 10) {
            speed -= 10;
        }
        System.out.println(brand + " is moving slowly.");
    }
    // Move Left
    public void moveLeft() {
        System.out.println(brand + " turned left.");
    }

    // Move Right
    public void moveRight() {
        System.out.println(brand + " turned right.");
    }

    // Creative Feature
    public void horn() {
        System.out.println(brand + " Horn: Beep Beep!");
    }

    // Display State
    public void displayState() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Engine On: " + engineOn);
        System.out.println("Fuel Level: " + fuelLevel);
        System.out.println("Gear: " + gear);
        System.out.println();
    }



      
}
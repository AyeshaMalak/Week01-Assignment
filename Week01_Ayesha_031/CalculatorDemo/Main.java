public class Main {

    public static void main(String[] args) {

        Calculator calculate = new Calculator();

        System.out.println("Addition = " + calculate.add(10, 5));
        System.out.println("Subtraction = " + calculate.subtract(10, 5));
        System.out.println("Multiplication = " + calculate.multiply(10, 5));
        System.out.println("Division = " + calculate.divide(10, 5));

         System.out.println("Division by Zero = " + calculate.divide(10, 0));


        System.out.println("Power = " + calculate.power(2, 3));
        System.out.println("Average = " + calculate.average(10, 20));
    }
}
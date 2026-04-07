 class InvalidValueException extends RuntimeException {
    public InvalidValueException(String message) {
        super(message);
    }
}
public class Udexc  {
    public static void provideData(int a ,int b) {
        if (b==0){
            System.out.println("Attempting a bulid in arthimetic exception ...");
            int result = a / b;
            System.out.println("Result: " + result);

        }
        if(a<0 || b<0){
            System.out.println("Attempting to throw a user-defined exception for negative numbers...");
            throw new InvalidValueException("input values cannot be negative");
        }
        System.out.println("Data provided successfully:");
    }
    public static void main(String[] args) {
        try {
            provideData(10, 0);
            provideData(-5, 10);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
            }
         catch (InvalidValueException e) {
            System.out.println("Caught a user-defined exception: " + e.getMessage());
        }
    }
}

package checkedAndUncheckedExceptions;

public class UncheckedExceptionOrRunTimeException //runTimeExceptions

{
    public static void main(String[] args) {

        int x = 0;
        int y = 10;
        //int z=y/x;
        try {

          int z = y / x;
            System.out.println(z);
        } catch (RuntimeException e) { //here instead of RuntimeException( which only handles all unchecked exceptions) we can mention Exception/Throwable so that it will handle all checked and unchecked exceptions
            // Handling the exception
            System.out.println("Error: Cannot divide by zero.");
        }
    }

}

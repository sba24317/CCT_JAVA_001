import java.util.Scanner;  // Import the Scanner class

public class Question11 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        // two number to be userd as part of my calculation
        int intFirstNumber = 0 ;
        int intSecNumber = 0;

        System.out.print("Enter first  number: ");
        intFirstNumber = Integer.parseInt(oMyScanner.nextLine());
        System.out.print("Enter Second number: " );
        intSecNumber = Integer.parseInt(oMyScanner.nextLine());
        
        System.out.println("");
        System.out.println("Sum between " + intFirstNumber + " and " + intSecNumber + " is: " + (intFirstNumber + intSecNumber));
        System.out.println("Multiplication between " + intFirstNumber + " and " + intSecNumber + " is: " + (intFirstNumber * intSecNumber));
        System.out.println("Subtraction between " + intFirstNumber + " and " + intSecNumber + " is: " + (intFirstNumber - intSecNumber));
        System.out.println("Sum between " + intFirstNumber + " and " + intSecNumber + " is: " + (intFirstNumber / intSecNumber));


    }
}

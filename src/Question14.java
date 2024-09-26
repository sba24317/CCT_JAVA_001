import java.util.Scanner;  // Import the Scanner class

public class Question14 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        // two number to be userd as part of my calculation
        int intFirstNumber = 0 ;
        int intSecNumber = 0;
        int intThrirdNumber = 0;
        int intMaxNumber  = 0;

        System.out.print("Enter first  number: ");
        intFirstNumber = Integer.parseInt(oMyScanner.nextLine());

        intMaxNumber = intFirstNumber;

        System.out.print("Enter Second number: " );
        intSecNumber = Integer.parseInt(oMyScanner.nextLine());

        intMaxNumber = (intSecNumber > intMaxNumber) ? intSecNumber : intMaxNumber;

        System.out.print("Enter Third number: " );
        intThrirdNumber = Integer.parseInt(oMyScanner.nextLine());

        intMaxNumber = (intThrirdNumber > intMaxNumber) ? intThrirdNumber : intMaxNumber;
        

        System.out.println("");
        System.out.println("Biggest number is: " + intMaxNumber);
      
    }
}

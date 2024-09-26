import java.util.Scanner;  // Import the Scanner class

public class Question15 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        int intNumber = 0 ;

        System.out.print("Enter a number: ");
        intNumber = Integer.parseInt(oMyScanner.nextLine());

        String strMessage = ( intNumber % 2 == 0) ? "even" : "odd";
      
        System.out.println("Number " + intNumber + " is " + strMessage );
    }
}

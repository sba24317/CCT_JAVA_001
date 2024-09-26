
import java.io.File;
import java.util.Scanner;  // Import the Scanner class


/**
    3 – Change the previous code (question 22) asking the folder and test it .. 
 */
public class Question23 {
    // this is a java feature, to suppress warnings on editor
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) throws Exception {
        
        // setting variables we will need
        String newLine      = "\n";
        float startCarValue = 0 ;
        float depositValue = 0 ;
        float valueDue = 0;
        int yearsMorgate = 0;
        float interestRate  = 0.00f;
        File file;
        Scanner oMyScanner;

        // now write the file data
        file = new File("fileQuestion22.txt");

        oMyScanner = new Scanner(file);
      
        startCarValue = Float.parseFloat(oMyScanner.nextLine());
        System.out.println("Initial price: " + String.format("%.02f", startCarValue) );
        
        depositValue = Float.parseFloat(oMyScanner.nextLine());
        System.out.println("Deposit value: " + String.format("%.02f", depositValue ) );
        
        valueDue = startCarValue - depositValue;
        
        System.out.print("Years to pay: ");
        yearsMorgate = Integer.parseInt(oMyScanner.nextLine());
        System.out.println(yearsMorgate);
        
        interestRate = Float.parseFloat(oMyScanner.nextLine());
        System.out.println("Interest rate: " + String.format("%.02f", interestRate ) + "%" );
        
        System.out.println("balance due: " + String.format("%.02f",valueDue));
        
        // calculating value due
        valueDue = valueDue + ( (valueDue * (interestRate/100)) * yearsMorgate);
        
        System.out.println("Amout: " + String.format("%.02f", valueDue) );

    }
    
}

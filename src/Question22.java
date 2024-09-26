import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;  // Import the Scanner class


/**
    Change the Question21, to ask a name and surname, and print:
    Name + surname + Total value: value.
    Save this info in a file with the name of the customer and + date as text.
 */
public class Question22 {
    // this is a java feature, to suppress warnings on editor
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        // setting variables we will need
        String newLine      = "\n";
        float startCarValue = 0 ;
        float depositValue = 0 ;
        float valueDue = 0;
        int yearsMorgate = 0;
        float interestRate  = 0.00f;
        File file;
        FileWriter fileWriter;

        
        System.out.print("Enter a initial car value: ");
        startCarValue = Float.parseFloat(oMyScanner.nextLine());

        System.out.print("Enter value to pay in advanced : ");
        depositValue = Float.parseFloat(oMyScanner.nextLine());
        
        valueDue = startCarValue - depositValue;
        
        System.out.print("How many years to pay: ");
        yearsMorgate = Integer.parseInt(oMyScanner.nextLine());
        
        System.out.print("Enter interest rate : ");
        interestRate = Float.parseFloat(oMyScanner.nextLine());
     
        System.out.println("Initial price: " + String.format("%.02f", startCarValue) );
        System.out.println("Deposit value: " + String.format("%.02f", depositValue ) );
        
        System.out.println("balance due: " + String.format("%.02f",valueDue));
        
        // calculating value due
        valueDue = valueDue + ( (valueDue * (interestRate/100)) * yearsMorgate);
        
        System.out.println("Amout: " + String.format("%.02f", valueDue) );

        // now write the file data
        file = new File("fileQuestion22.txt");
        
        // delete file if it exists
        file.delete();
        // create a new file
        file.createNewFile();

        // starts object that will write data
        fileWriter = new FileWriter(file.getAbsolutePath());

        // write data in file      
        fileWriter.write ( String.valueOf(startCarValue) + newLine );
        fileWriter.write ( String.valueOf(depositValue)  + newLine );
        fileWriter.write ( String.valueOf(yearsMorgate)  + newLine );
        fileWriter.write ( String.valueOf(interestRate)  + newLine ); 

        fileWriter.close();
    }
    
}

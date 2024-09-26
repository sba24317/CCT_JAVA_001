import java.util.Scanner;  // Import the Scanner class

/**
    1 – Buying a car program.
    You bought a car and you want to check the final value.
    Ask for the price
    Ask for a deposit
    Ask for number of years
    Ask for interest (year)
    Calculate the final value.
 */

public class Question21 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        // setting variables we will need
        float startCarValue = 0 ;
        float depositValue = 0 ;
        float valueDue = 0;
        int yearsMorgate = 0;
        float interestRate  = 0.00f;
        
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
    }
}

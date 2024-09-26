import java.util.Scanner;  // Import the Scanner class

/**
 * 6.	Ask a letter and check if it is a vowel , print if it’s a vowel.
 */
public class Question16 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        String strLetter = "" ;

        System.out.print("Enter a letter: ");
        strLetter = oMyScanner.nextLine();

        if ( strLetter.toUpperCase().equals("A") ||  strLetter.toUpperCase().equals("E") || strLetter.toUpperCase().equals("I") || strLetter.toUpperCase().equals("A") || strLetter.toUpperCase().equals("O") ||  strLetter.toUpperCase().equals("U"))
            System.out.println(strLetter + " is a vowel ");
        else
            System.out.println(strLetter + " is NOT a vowel ");
    }
}

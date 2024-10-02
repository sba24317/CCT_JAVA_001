import java.util.Scanner;  // Import the Scanner class

/**
 * 6.	Ask a letter and check if it is a vowel , print if it’s a vowel.
 */
public class Question16 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // Object that can read from keyboard
        Scanner oMyScanner = new Scanner(System.in);
        
        // read keyboard and  transform apply uppercase to its value
        System.out.print("Enter a value: ");
        String strLetter =  oMyScanner.nextLine();
        strLetter = (strLetter.length() > 0) ? strLetter.substring(0,1): strLetter;

        String vowels = "aeiouAEIOU";

        if ( vowels.contains(strLetter) )
            System.out.println(strLetter + " is a vowel ");
        else
            System.out.println(strLetter + " is NOT a vowel ");
    }
}
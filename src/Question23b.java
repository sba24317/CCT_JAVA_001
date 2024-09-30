
import java.io.File;
import java.util.Scanner; // Import the Scanner class
import org.json.*;

/**
 * 3 – Change the previous code (question 22) asking the folder and test it ..
 */
public class Question23b {
    // this is a java feature, to suppress warnings on editor
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) throws Exception {

        // setting variables we will need
        JSONObject json;
        String strFile = "";
        float startCarValue = 0;
        float depositValue = 0;
        float valueDue = 0;
        int yearsMorgate = 0;
        float interestRate = 0.00f;
        File file;
        Scanner oMyScanner;

        // Object that represent file
        file = new File("C:\\Users\\valter\\Documents\\CCT\\Java\\001_CCT\\src\\fileQuestion22.json");

        // object that read the file
        oMyScanner = new Scanner(file);

        // read entire file to strvariable
        while (oMyScanner.hasNext())
            strFile += oMyScanner.next();

        // start a new instance of a json file
        json = new JSONObject(strFile);

        // read json propertie
        startCarValue = json.optLong("startCarValue", 0);
        depositValue = json.optLong("depositValue", 0);
        yearsMorgate = json.optInt("yearsMorgate", 0);
        interestRate = json.optLong("interestRate", 0);

        System.out.println("Initial price: " + String.format("%.02f", startCarValue));

        System.out.println("Deposit value: " + String.format("%.02f", depositValue));

        valueDue = startCarValue - depositValue;

        System.out.print("Years to pay: " + yearsMorgate);

        System.out.println("Interest rate: " + String.format("%.02f", interestRate) + "%");

        System.out.println("balance due: " + String.format("%.02f", valueDue));

        // calculating value due
        valueDue = valueDue + ((valueDue * (interestRate / 100)) * yearsMorgate);

        System.out.println("Amout: " + String.format("%.02f", valueDue));

    }

}

// Import libraries here
import java.util.Scanner;
import java.text.NumberFormat;
public class Assignment1 {
    public static void main(String[] args) {
        //Dennis Tekyi
        final int BASE = 32;
        Scanner scan = new Scanner(System.in);
        final double CONVERSION_FACTOR = 5.0 / 9.0;

        System.out.println("\nDDDDDD          TTTTTTTTTTTTTTT" );
        System.out.println("DD    DD               TT");
        System.out.println("DD      DD             TT");
        System.out.println("DD       DD            TT");
        System.out.println("DD       DD            TT");
        System.out.println("DD      DD             TT");
        System.out.println("DD     DD              TT");
        System.out.println("DD   DD                TT");
        System.out.println("DDDDD                  TT");


        System.out.print("Enter the Temperature: ");
        String user_input = scan.nextLine();
        double fahrenheitTemp = Double.parseDouble(user_input);
        double celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
        System.out.print("Your Temperature in celsius is: " + celsiusTemp);




    }
}

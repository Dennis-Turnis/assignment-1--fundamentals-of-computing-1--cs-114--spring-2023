// Import libraries here
import java.util.Scanner;
//import java.text.digitsFormat;

import java.util.Random;
public class Assignment1 {
public static void main(String[] args) {
 //Dennis Tekyi
    final int BASE = 32;
      Scanner scan = new Scanner(System.in);
      final double CONVERSION_FACTOR = 5.0 / 9.0;
      int str;

      System.out.println("\nDDDDDD          TTTTTTTTTTTTTTT" );
      System.out.println("DD    DD               TT");
      System.out.println("DD      DD             TT");
      System.out.println("DD       DD            TT");
      System.out.println("DD       DD            TT");
      System.out.println("DD      DD             TT");
      System.out.println("DD     DD              TT");
      System.out.println("DD   DD                TT");
      System.out.println("DDDDD                  TT");


      System.out.print("Enter the Temperature in Fahrenheit: ");
      String user_input = scan.nextLine();
      double fahrenheitTemp = Double.parseDouble(user_input);
      double celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
      System.out.print("Your Temperature in celsius is: " + celsiusTemp);

      //Third part: Takes input and reverses, program then displays only 3 digits
      String newWord;
      Scanner revWord = new Scanner(System.in);
      System.out.println("\nType in string to be reversed");
      newWord = revWord.nextLine();

      //Declaring a method to reverse input
      StringBuilder reversedString = new StringBuilder(newWord);
      reversedString.reverse();  // Reversing value stored
      String result = reversedString.toString();

      String twisted = result.substring(1,4);
      System.out.println("Reversed string without first and last characters: " + twisted);

      //Fourth part: Generating random digits between 32 and 16,384
      Random unknown = new Random();
      int digits = unknown.nextInt(32,16384);
      System.out.println("A random integer: " + digits);

      //This line of code displays final output as requested
      System.out.println("Your new string is: " + celsiusTemp + twisted + digits);





    }
}

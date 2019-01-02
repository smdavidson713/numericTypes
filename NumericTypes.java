 import java.util.Scanner; // scanner class task #2
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class
import java.io.*; // toUppercase class task #3
import java.lang.Math; // math class task #4

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      Scanner keyboard = new Scanner(System.in); // user input task #2
      // (not used for alternate)

      // Identifier declarations
      final double NUMBER = 2 ;        // Number of scores
      final double SCORE1 = 100;       // First test score
      final double SCORE2 = 95;        // Second test score
      final double BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // task #2 variables
      String FIRSTNAME; // first name
      String LASTNAME;  // last name
      String FULLNAME; // full name

      // task #3 variables
      char ch1;

      // task #4 variables
      double diameter; 
      double radius;
      double volume; 

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (0.5/0.9) * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // Task #2
      System.out.println("What is your first name?"); // Prompt the user for first name
      FIRSTNAME = keyboard.nextLine();// Read the user's first name
      System.out.println("What is your last name?"); // Prompt the user for last name
      LASTNAME = keyboard.nextLine(); // Read the user's last name
      FULLNAME = FIRSTNAME + " " + LASTNAME; // Concatenate the user's first and last names
      System.out.println(FULLNAME); // Print out the user's full name

      System.out.println();      // To leave a blank line

      // Task #3
      ch1 = FIRSTNAME.charAt(0);// Get the first character from the user's first name
        System.out.println(ch1); // Print out the user's first initial
     FULLNAME = FULLNAME.toUpperCase();// Convert the user's full name to uppercase
      System.out.println(FULLNAME);// Print out the user's full name in uppercase

      System.out.println();      // To leave a blank line

      // Task #4
      System.out.println("what is the diameter of the sphere?"); // Prompt the user for a diameter of a sphere
      diameter = keyboard.nextDouble();// Read the diameter
      if(diameter < 0){
         System.out.println("diameter cannot be less than 0");
      }
      else{
      radius = 2 * diameter; // Calculate the radius
      volume = (0.4/0.3)*Math.PI*Math.pow(radius, 3);// Calculate the volume
      System.out.println("The volume of the sphere is " + volume);// Print out the volume
   }

   }
}
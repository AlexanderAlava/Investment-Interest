//================================================================================\\
//=10/16/2015 (MY BIRTHDAY)                                       Alexander Alava=\\
//=Investment.java                                                      U35432961=\\
//=                                                                              =\\
//= This program asks the user for a principle to invest and the amount of years =\\
//= desired for the investment. Then calculates the amount of interest earned per=\\
//=     year, balance per year and total amount earned after this investment.    =\\
//================================================================================\\ 

import java.util.Scanner;
import java.text.NumberFormat;

public class Investment
{
   public static void main (String [] args)
   {
   
      //Declaring variables and strings\\
      int numberYears = 0;
      double amountInvested = 0;
      double totalGain = 0;
      String quit;
      
      //Declaring and initializing Scanner object\\
      Scanner scan = new Scanner (System.in);
   
      //Prompting for and reading in user input for numberYears and amountInvested\\
      System.out.println("Hello user!");
      
      do
      {
         System.out.println("Please enter the number of years desired " +
                            "for your investment: ");
         numberYears = scan.nextInt();
         System.out.println("\nPlease enter the initial amount to be invested: ");
         amountInvested = scan.nextDouble();
      
         //Validating numberYears and amountInvested\\
         while (numberYears <= 0 || amountInvested <= 0)
         {
            System.out.println("Your input is not valid\nEnter a valid input!");
            System.out.println("\nPlease enter the number of years desired for your " +
                            "investment: ");
            numberYears = scan.nextInt();
            System.out.println();
            System.out.println("Please enter the initial amount to be invested: ");
            amountInvested = scan.nextDouble();                   
         }
         
         //Reseting totalGain for each run\\
         totalGain = 0;
         
         //Declaring and initializing NumberFormat\\
         NumberFormat money = NumberFormat.getCurrencyInstance();
      
         //Printing initial balance\\
         System.out.println("\nYour initial balance before interests is: " + 
                            money.format(amountInvested));
      
         //Calculating and printing the balance for each year\\
         for (int i = 1; i <= numberYears; i++)
         {
            double yearInterest = (amountInvested*0.05);
            amountInvested = (amountInvested + yearInterest);
            System.out.println("\nYour balance after year " + i + ": " + 
                               money.format(amountInvested));
            System.out.println("This year's gains will be " + 
                               money.format(yearInterest));
            totalGain = totalGain + yearInterest;                     
         }
         
         //Printing totalGain and asking the user to quit or continue\\
         System.out.println("\nThrough this investment you will make " + 
                            money.format(totalGain));
         System.out.println("\nPlease type any key to make another calculation or the " +
                            "word \"quit\" to exit this program: ");
                            
         //Read any unprocessed \n character\\
         quit = scan.nextLine();
         
         //Read expected quit input\\
         quit = scan.nextLine();                                      
      }
      while (!quit.equalsIgnoreCase("quit"));
      
      //Thanking the user for using the program and printing credits\\
      System.out.println("\nThank you for using this program!");
      System.out.println("\n-----------------------------------------------");
      System.out.println("|     Program developed by Alexander Alava    |");
      System.out.println("-----------------------------------------------");                      
   }
}
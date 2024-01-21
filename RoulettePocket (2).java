
/*
RoulettePocket Project
*/
import java.util.*;       //wildcard import statement to get scanner

public class RoulettePocket
{

private int pocketNumber;              //holds the pocketnumber
private String pocketColor;            //holds the pocketColor


   /**
   The constructor accepts a pocket number.
   @param pocketNumber pocket number.
   */
   public RoulettePocket(int num)
   {
    pocketNumber = num;  
   }


   /**
   getPocketColor method
   @return the pocket’s color, as a string.
   */
   public String getPocketColor()
   {
    if (pocketNumber == 0)
      {
       return "green";
      }
    else if (pocketNumber <= 10)
      {
        if ((pocketNumber % 2) == 0)
        {
         return "black";
        }
        else if ((pocketNumber %2) != 0)
        {
         return "red";
        }
      }

     else if (pocketNumber <= 18)
      {
        if ((pocketNumber % 2) == 0)
        {
         return "red";
        }
        else if ((pocketNumber %2) != 0)
        {
         return "black";
        }
      }
      else if (pocketNumber <= 28)
      {
        if ((pocketNumber % 2) == 0)
        {
         return "black";
        }
        else if ((pocketNumber %2) != 0)
        {
         return "red";
        }
      }
      else if (pocketNumber <= 36)
      {
        if ((pocketNumber % 2) == 0)
        {
         return "red";
        }
       else if ((pocketNumber %2) != 0)
        {
         return "black";
        }
      }
      return "error";

   }


}

//to test roulette class
class RoulettePocketTest
{

   public static void main(String[] args)
   {

   int number;                                        //holds pocketNumber for user


   //create a scanner object for keyboard input
   Scanner keyboard = new Scanner(System.in);

   //ask the user to enter pocket number
   System.out.println("Enter a pocket number between 0-36: ");     
   number = keyboard.nextInt();


   //while loop to make sure user enters number 0-36
   while (number < 0|| number > 36)
   {
   System.out.println("Error: Please enter number between 0-36");
   number = keyboard.nextInt();
   }

   RoulettePocket roulette = new RoulettePocket(number);

   //displays colors to user
   System.out.println("Color: " + roulette.getPocketColor());


   }
}
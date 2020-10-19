import java.util.Scanner;
/**
 * Class Microwave
 */
  public class Microwave {
    public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Are you heating a sub, pizza or soup!");
        
      //Declare the Strins and double
      String userChoose;
      double userQuantity;
        
       //
      userChoose = userInput.next();
      System.out.println("***userChoose = " + userChoose);
        
      //This ask the user which item they want to eat and the quantity
      if (userChoose.equals("sub")) {
        System.out.println(" How many Sub do you need (3 Max)");
        userQuantity = userInput.nextDouble();
            
        //Calculate the time it will take to heat the Sub
        if (userQuantity == 1 ){
          System.out.println( " The time will be: " + 60 + " Sec ");
        } 
        // Calculate the timer of sub at 50%
        else if (userQuantity == 2 ){
          System.out.println( " The time will be: " + 90 + " Sec ");
        } 
        // Calculate the time the sub at 100%
        else if ( userQuantity == 3 ){
          System.out.println( " The time will be: " + 120 + " Sec ");
        }
        //This put an error if the user enter a number more than 3
        else {
          System.out.println( " Error" );
        }
      }  
        //This ask the user which item they want to eat and the quantity
        if (userChoose.equals("pizza")) {
          System.out.println(" How many Pizza do you need (3 Max)");
          userQuantity = userInput.nextDouble();
            
          //Calculate the time it will take to heat the Sub
          if (userQuantity == 1 ){
            System.out.println( " The time will be: " + 45 + " sec ");
          } 
          // Calculate the timer of sub at 50%
          else if (userQuantity == 2 ){
            System.out.println( " The time will be: " + 68 + " Sec ");
          } 
          // Calculate the time the sub at 100%
          else if ( userQuantity == 3 ){
            System.out.println( " The time will be: " + 90 + " Sec ");
          }
          //This put an error if the user enter a number more than 3
          else {
            System.out.println( " Error" );
          }
        }
            //This ask the user which item they want to eat and the quantity
          if (userChoose.equals("soup")) {
            System.out.println(" How many Soup do you need (3 Max)");
            userQuantity = userInput.nextDouble();
            
            //Calculate the time it will take to heat the Sub
            if (userQuantity == 1 ){
              System.out.println( " The time will be: " + 105 + " sec ");
            } 
            // Calculate the timer of sub at 50%
            else if (userQuantity == 2 ){
              System.out.println( " The time will be: " + 158 + " Sec ");
            } 
            // Calculate the time the sub at 100%
            else if ( userQuantity == 3 ){
              System.out.println( " The time will be: " + 210 + " Sec ");
            }
            //This put an error if the user enter a number more than 3
            else {
              System.out.println( " Error" );
            }
            
          }
        
      
    } 
  }  
    
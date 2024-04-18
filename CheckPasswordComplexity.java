package st10433574.prog5121.poe.part1;
import java.util.Scanner;
/**
 *
 * @author RantUser Tanaka Bvekerwa
 */
public class CheckPasswordComplexity {
    public static void CheckPasswordComplexity(){
        //initialising password strength test variables
        final int NUM_UPPER_LETTERS = 1;
        final int NUM_DIGITS = 1;
          int upperCount = 0;
          int digitCount = 0;
 
          Scanner in = new Scanner(System.in);
          //Prompt user to enter userPassword
          System.out.print("Enter your password: ");
          String userPassword = in.nextLine();
          
          //declaring integer variable to determine password length
          int inputLength = userPassword.length();
          
          //declaring boolean to check for a special characters in userPassword 
           boolean specialCharacter = userPassword.startsWith("$");
          
          //Character:
          for(int i=0;i<inputLength;i++){
              char ch = userPassword.charAt(i);
              
            //if statement to increase count if the password has required amount of capital letters 
              if(Character.isUpperCase(ch))
                  upperCount++;
              
            //else statement to increase count if the password has required amount of numbers 
              else if(Character.isDigit(ch))
                  digitCount++;
                  
          }
           //if-else statements to test password complexity conditions
          if(upperCount >= NUM_UPPER_LETTERS && digitCount >= NUM_DIGITS && inputLength >= 8 && specialCharacter)
              //output when the userPassword meets all the requirements
              System.out.println("Password successfully captured");
          else{
              System.out.println("Password is not correctly formatted, please ensure that the password contains the following:");
              if(inputLength < 8)
                  //output when userPassword does not contain the required amount of characters
                  System.out.println("- at least 8 characters");
              
              if(upperCount < NUM_UPPER_LETTERS)
                  //output when userPassword does not contain the required amount of Uppercase characters
                  System.out.println("- 1 or more uppercase letters");
              
              if(digitCount < NUM_DIGITS)
                  //output when userPassword does not contain the required amount of Numerical characters
                  System.out.println("- 1 or more numbers");
              
              if(specialCharacter == false)
                  //output when userPassword does not contain a special character
                  System.out.println("- start with $ as a special character");
          }
          
    }
}

 
    
    


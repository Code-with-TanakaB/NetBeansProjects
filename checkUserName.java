package st10433574.prog5121.poe.part1;

import java.util.Scanner;

/**
 *
 * @author RantUser Tanaka Bvekerwa
 */
public class checkUserName {
    public static void checkUserName(){
          
          Scanner in = new Scanner(System.in);
          //Prompt user to enter username
          System.out.print("Enter userName: ");
          String userName = in.nextLine();
           
          //declaring integer variable to determine username length
          int inputLength = userName.length();
          boolean special_ = userName.endsWith("_");
          
          //Character:
          for(int i=0;i<inputLength;i++){
              char ch = userName.charAt(i);
   
          }
          //if-else statements to test username conditions
          if(inputLength <= 5 && special_)
              
          //output when username meets length requirements
              System.out.println("Username successfully captured");
          else{
              //output when username does not meet length requirements
              System.out.println("username is incorrectly formatted, contains a maximum of 5 characters and ends with an underscore");
              
          }
       }
    }



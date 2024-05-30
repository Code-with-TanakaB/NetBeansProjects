
package st10433574_prog5121_poe_part1;

import java.util.Scanner;

/**
 *
 * @author RantUser Tanaka Bvekerwa
 */
public class TaskDescription {
    public static void checkTaskDescription(){
        Scanner in = new Scanner(System.in);
        String taskDescribe = in.nextLine();
        //declaring integer variable to determine task description length
                        int inputLength = taskDescribe.length();
         
                      //Character:
                        for(int i=0;i<inputLength;i++){
                        char ch = taskDescribe.charAt(i);
                    }
                       
                      //if-else statements to test Task description conditions
                       if(inputLength <= 50 )
              
                     //output when Task description meets all requirements
                       System.out.println("Task description successfully captured");
                  else{
                      //output when Task description does not meet length requirements
                       System.out.println("Please enter a task description of less than 50 characters");
              
                      }
    }
}

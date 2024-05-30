
package st10433574_prog5121_poe_part1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tanaka Bvekerwa
 */
public class TaskStatus {
    public static void TaskStatus(){
		
                //Case structure to set conditions for each task status option
		ArrayList<String> olist = new ArrayList<String>();
		Scanner oSc=new Scanner(System.in);
		
                System.out.println("");
                System.out.println("*********** Choose the following options to continue **************");
                System.out.println("");
		System.out.println("1.To Do\n2.Doing\n3.Done");
		int ieditvalue = oSc.nextInt();
		switch(ieditvalue)
		{
		case 1:
			System.out.println("Task is scheduled.");
			
			break;

		case 2:
			System.out.println("Task is in progress.");
			
			break;
		case 3:
                       System.out.println("Task completed");
                       
                       break;
		default:
			System.out.println("No such operation");
			break;
		
		}
		
	}
}




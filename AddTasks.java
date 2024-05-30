
package st10433574_prog5121_poe_part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static st10433574_prog5121_poe_part1.TaskDescription.checkTaskDescription;
import static st10433574_prog5121_poe_part1.TaskStatus.TaskStatus;

/**
 *
 * @author RantUser
 */
public class AddTasks {
    public static void newTasks(){
        
                //declaring integer to keep count of added tasks  
		int iTasks=0;
                //declaring string variable to hold the tasks added
		String sTask;
		
                System.out.println("**************** Welcome To EasyKanban ***********************");
                System.out.println("");
                
                //Array list command line to hold the tasks
		ArrayList<String> olist = new ArrayList<String>();
                
                //Scanner command line to hold user input of the number of tasks
		Scanner oSc=new Scanner(System.in);
		System.out.println("Enter Number of Tasks: ");
		iTasks=oSc.nextInt();
                
                //for-loop to automatically increment the number of tasks 
		for(int i=0; i<iTasks;i++)
		{
			System.out.println("Enter Task name/s "+ (i+1) +":");
			oSc=new Scanner(System.in);
			sTask=oSc.nextLine();
                        
                        
                        System.out.println("");
                        System.out.println("*********** Your Tasks **************");
                        System.out.println("");
			olist.add(sTask);
			//i=i+1;
		}
		//Traversing list through Iterator  
		Iterator itr=olist.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  	
		}
                System.out.println("");
                System.out.println("*********** Choose the following options to continue **************");
                System.out.println("");
                
                //Output message to prompt user to choose any of the three options
		System.out.println("1.Add tasks\n2.Show Report\n3.Quit");
		int ieditvalue = oSc.nextInt();
                
                //case structure to set the conditions for each option
		switch(ieditvalue)
		{
		case 1:
			System.out.println("Enter the new task name:");
			oSc=new Scanner(System.in);
			sTask=oSc.nextLine();
			olist.add(sTask);
                        sTask = sTask.substring(0, 2);
                        System.out.println(sTask.toUpperCase());
                        
                        System.out.println("Enter the new task number:");
                        Scanner taskNum = new Scanner(System.in);
                        int taskNumber;
			taskNumber=taskNum.nextInt();
                        
                        for(int y=0;y<taskNumber;y++)
                            y=y+1;
                        
                        
                        System.out.print("Enter Task Description: ");
                        //calling the module to check task description length
                        checkTaskDescription();
                        
                        Scanner in = new Scanner(System.in);
                        System.out.print("Developer Name: ");
                        String devName = in.nextLine();
                        //substring() to only display the last letters for the developer details
                        devName = devName.substring(devName.length()-3);
                            
                        TaskStatus();
                        
                        System.out.print("Task Duration(hrs): ");
                        int taskTimes = in.nextInt();
                        
                        if(taskTimes > 0)
                        System.out.println("Your task should last: "+taskTimes+"hrs");
                        System.out.println("");
                        
                        //Output message when the task has been added successfully
                        System.out.println("The task is added successfully");
                        System.out.println("");
                        System.out.println("*********** All Your Tasks **************");
                        System.out.println("");
                    
			Iterator itr1=olist.iterator();  
			while(itr1.hasNext())
			{  
			System.out.println(itr1.next());  	
			}
                        
    

                        //Output message to display the newly added task ID
                        System.out.println("New Task ID: " + sTask +":"+ taskNumber +":"+ devName);
                        
                        //JOptionPane message dialogs that will display user's details
                        JOptionPane.showMessageDialog(null, "Task Status: in progress");
                        JOptionPane.showMessageDialog(null, "Developer Details: " + devName);
                        JOptionPane.showMessageDialog(null, "Task Number: "+ taskNumber);
                        JOptionPane.showMessageDialog(null, "Task Name: "+ sTask);
                        JOptionPane.showMessageDialog(null, "Task Duration(hrs): " + taskTimes+"hrs");
                        JOptionPane.showMessageDialog(null, "New Task ID: " + sTask +":"+ taskNumber +":"+ devName);
			break;

		case 2:
			System.out.println("Coming Soon");
			
		case 3:
                       System.out.println("Bye Friend");
                       System.exit(0);
                       break;
		default:
			System.out.println("No such operation");
			break;
                }
	}
}

  
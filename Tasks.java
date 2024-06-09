
package st10433574_prog5121_poe_part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static st10433574_prog5121_poe_part1.TaskDescription.checkTaskDescription;
import static st10433574_prog5121_poe_part1.TaskStatus.TaskStatus;

/**
 *
 * @author RantUser
 */
public class Tasks {
    private static final ArrayList<String> tasks = new ArrayList<>();

    public static void addTasks() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            
            System.out.println("");
            System.out.println("*********************** Choose the following to continue **********************************");
            System.out.println("");
            
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        
        System.out.println("");
        System.out.println("*********************** Add Your Task **********************************");
        System.out.println("");
        
        System.out.print("Enter task name: ");
        String task = scanner.nextLine();
        tasks.add(task);
        
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
                        
                        System.out.print("Project Name: ");
                        String devProject = in.nextLine();
                        
                        TaskStatus();
                        
                        System.out.print("Task Duration(hrs): ");
                        int taskTimes = in.nextInt();
                        
                        if(taskTimes > 0)
                        System.out.println("Your task should last: "+taskTimes+"hrs");
                        System.out.println("");
                        
                        //Output message when the task has been added successfully
                        System.out.println("The task is added successfully");
                        System.out.println("");
                        System.out.println("*********** Tasks Report **************");
                        System.out.println("");
                    
			Iterator itr1=tasks.iterator();  
			while(itr1.hasNext())
			{  
			System.out.println(itr1.next());  	
			}
                        System.out.println("Task duration (hrs): " + taskTimes + "hrs");
           
                        
                        //Output message to display the newly added task ID
                        System.out.println("New Task ID: " + task.substring(0, 2).toUpperCase() +":"+ taskNumber +":"+ devName.substring(devName.length()-3).toUpperCase());
                        
                        //JOptionPane message dialogs that will display user's details
                        JOptionPane.showMessageDialog(null, "Task Status: in progress");
                        JOptionPane.showMessageDialog(null, "Developer Details: " + devName.substring(devName.length()-3).toUpperCase());
                        JOptionPane.showMessageDialog(null, "Task Number: "+ taskNumber);
                        JOptionPane.showMessageDialog(null, "Task Name: "+ task.substring(0, 2).toUpperCase());
                        JOptionPane.showMessageDialog(null, "Task Duration(hrs): " + taskTimes+"hrs");
                        JOptionPane.showMessageDialog(null, "New Task ID: " + task.substring(0, 2).toUpperCase() +":"+ taskNumber +":"+ devName.substring(devName.length()-3).toUpperCase());
                        
                        
	
    // Declaring an string array
    String arr[] = { devName, devProject };
 
        // Sorting the above arrays
        // using sort() method of Arrays class
        Arrays.sort(arr);
        
 
        String key = devName;
        int res = Arrays.binarySearch(arr, key);
 
        if (res >= 0)
            System.out.println(
                "Developer " +key + " found at index = " + res);
        else
            System.out.println(key + " Not found");
 
        key = devProject;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(
                "Your " + key + " project found at index = " + res);
        else
            System.out.println(key + " Not found");
    }
    

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to remove.");
        } else {
            viewTasks();
            System.out.print("Enter task number to remove: ");
            int index = scanner.nextInt();
            if (index > 0 && index <= tasks.size()) {
                tasks.remove(index - 1);
                System.out.println("Task removed successfully.");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }
}


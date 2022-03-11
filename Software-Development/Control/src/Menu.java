import java.util.Scanner;
 
public class Menu {
   
    /**
     * Type Choice field
     */
    Choice option;
   
    /**
     * Displays Menu
     */
    public void displayMenu ()
    {
        System.out.println("Please select one of the below:");
        System.out.println("1 - Grade for student's mark");
        System.out.println("2 - Boundary Calculations");
        System.out.println("3 - Comparison of number");
        System.out.println("4 - Grade for student's mark with a bit of spice");
        System.out.println("0 - Exit");
 
    }
       
    /**
     * Calls displayMenu
     * Proccesses user input and calls the function associated with the input
     */
    public void processUserChoices ()
    {
      
        boolean exit = false;
        Scanner s1 = new Scanner(System.in);
     
       
        do {
        displayMenu();
        int input = s1.nextInt();
        s1.nextLine();

           
        if (input == 0)
        {
            option.exit();
            exit = true;
            break;
        }
       
        else if (input == 1)
        {
            option.Grades();
        }
       
        else if (input == 2)
        {
            option.Table();
        }
       
        else if (input == 3)
        {
            option.numberComparison();
        }
        
        else if (input == 4)
        {
        	option.fancyGrades();
        }
               
        else {
            System.out.println("An invalid option was selected!");
        }
 
       
       
        }while(!exit);
       
    }
}
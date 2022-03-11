import java.util.Scanner;
 
public class Menu {
    
   
    /**
     * Displays Menu
     */
    private static void displayMenu ()
    {
        System.out.println("Please select one of the below:");
        System.out.println("1 - Initialise file exercises");
        System.out.println("2 - Deciphering");
        System.out.println("3 - Processing Numerical Data");
        System.out.println("4 - 2D Array");
        System.out.println("0 - Exit");
 
    }
       
    /**
     * Calls displayMenu
     * Processes user input and calls the function associated with the input
     */
    public static void processUserChoices ()
    {
      
        boolean exit = false;
        Scanner s1 = new Scanner(System.in);
     
       
        do {
        displayMenu();
        int input = s1.nextInt();
        s1.nextLine();

           
        if (input == 0)
        {
           
            exit = true;
            break;
        }
       
        else if (input == 1)
        {
          	Files.fileReader();
    		Files.fileWriter();
    		Files.fileCopier();
        }
       
        else if (input == 2)
        {
        	Files.decipher();
        }
       
        else if (input == 3)
        {
            Files.details();
        }
        
        else if (input == 4)
        {
        	Files.array();
        }
               
        else {
            System.out.println("An invalid option was selected!");
        }
 
       
       
        }while(!exit);
       
    }
}
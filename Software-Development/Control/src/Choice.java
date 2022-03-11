import java.util.Scanner;

public class Choice {
				

	/**
	 * Scans user input and displays corresponding grade
	 */
	public static void Grades()
	{

		System.out.println("Please enter student's mark as a percentage.");
		Scanner s2 = new Scanner(System.in); 
        int mark = s2.nextInt();
        s2.nextLine();
		
		  if (mark > 69 && mark <=100)
	        {
	           System.out.println("A");
	        }
		  
		  else if (mark > 59 && mark <=69)
	        {
	           System.out.println("B");
	        }

		  else if (mark > 49 && mark <=59)
	        {
	           System.out.println("C");
	        }
		  
		  else if (mark > 39 && mark <=49)
	        {
	           System.out.println("D");
	        }
		  
		  else if (mark < 40 && mark >=0)
	        {
	           System.out.println("E");
	        }
		  
		  else{
			  System.out.println("An invalid mark was given");
		  }
	}
	
	/**
	 * Scans user input for two separate integer values
	 * Calls sumTable and passes integer values
	 */
	public static void Table()
	{
		
		System.out.println("Please enter lower bounds");
		Scanner s3 = new Scanner(System.in);
        int lower = s3.nextInt();
        s3.nextLine();

		
		System.out.println("Please enter upper bounds");
        int upper = s3.nextInt();
        s3.nextLine();
        sumTable(lower, upper);
	}
        
	/**
	 * Prints table of calculations
	 * @param lower integer value of lower bounds
	 * @param upper integer value of upper bounds
	 */
	public static void sumTable(int lower, int upper)
	{
		System.out.printf("\nValue \t\tSquare \t\tCube \t\tSquareroot\n");
		for (float n= lower; n<=upper; n++) {
			System.out.printf("%.2f \t\t%.2f \t\t%.2f \t\t%.2f\n", n, n*n, n*n*n, Math.sqrt(n));
		}
	}
	
	/**
	 * Scans for user input and uses it for basic maths operations
	 * Exits when -1 is entered 
	 */
	public static void numberComparison()
	{
		int loops = 0;
		int maximum = 0;
		int minimum = 0;
		int total = 0;
		double average = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
				
		do {			
			 System.out.println("Please enter a number");
			 Scanner s3 = new Scanner(System.in);
			 int number = s3.nextInt();
			 s3.nextLine();
			 
			 if (number == -1)
			 {
				 
				 break;
			 }
			 
			 loops++;
			 total = total+number;
			 average = (float)total/loops;
			 if (number < min) 
			 {
				 minimum = number;
				 min = number;
			 }
			 if (number > max)
			 {
				 maximum = number;
				 max = number;
			 }
		
		}while (true);
		
		System.out.printf(
				"\nTotal: %d\nAverage: %.2f\nMinimum: %d\nMaximum: %d\n",
				total, average, minimum, maximum);

	}
	
	/**
	 *Scans user input for corresponding grade inside of a loop
	 * If user enters 3 wrong formats or -1 it exits
	 */
	public static void fancyGrades()
	{
		int fail = 0;
		
		do {
			if(fail == 3)
			{
				break;
			}
			
			System.out.println("Please enter a percentage.");
			Scanner s2 = new Scanner(System.in); 
			int percentage = s2.nextInt();
			s2.nextLine();
			
			if (percentage == -1)
			{
				break;
			}
			
			if (percentage < 0 || percentage > 100)
			{
				System.out.println("Invalid percentage (0-100)");
				fail++;
				continue;
			}
			
			  if (percentage > 69 && percentage <=100)
		        {
		           System.out.println("A");
		        }
			  
			  else if (percentage > 59 && percentage <=69)
		        {
		           System.out.println("B");
		        }

			  else if (percentage > 49 && percentage <=59)
		        {
		           System.out.println("C");
		        }
			  
			  else if (percentage > 39 && percentage <=49)
		        {
		           System.out.println("D");
		        }
			  
			  else
		        {
		           System.out.println("E");
		        }
			  
		} while (true);

        
	}
	
	/**
	 * Prints "goodbye"
	 */
	public static void exit()
	{
		System.out.println("goodbye");
	}
	
}

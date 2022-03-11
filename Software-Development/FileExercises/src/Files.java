import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;


public class Files {
	
	/**
	 * Method for testing
	 */
	public static void runFileTests()
	{
		
	}
	
	/**
	 * Scans for user input and reads the corresponding .txt file
	 */
	public static void fileReader()
	{
		System.out.println("What file would you like to read?");
		Scanner s1 = new Scanner(System.in); 
        String fileName = s1.nextLine();

		
		FileReader fileReader;
		BufferedReader bufferedReader;
		String nextLine;


		try
		{
			fileReader = new FileReader (fileName);
			bufferedReader = new BufferedReader(fileReader);
			
			nextLine = bufferedReader.readLine();
			while (nextLine != null)
			{
			   System.out.println(nextLine);
			   nextLine = bufferedReader.readLine();
			}

			bufferedReader.close();
		}
			
		
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	}
	
	/**
	 * Creates a txt file
	 * Scans for user input
	 * Enters user input into txt file
	 */
	public static void fileWriter()
	{
        
		FileOutputStream outputStream;
		PrintWriter printWriter;
    

        	try
        	{
        		outputStream = new FileOutputStream("writtenValues.txt");
        		printWriter = new PrintWriter(outputStream); 
        		
        		Scanner s1 = new Scanner(System.in); 
                String line;

                System.out.println("Please enter text");
                
                while(!(line = s1.nextLine()).equals("")) 
                {
                	System.out.println("Please enter text");
                	printWriter.write(line+ "\n");
                }
                
                printWriter.close();
        	}
        	
        	catch(IOException e)
        	{
        		System.out.println(e);
        	}
        }

	/**
	 * Scans for user input and reads the corresponding .txt file
	 * Scans for user input and creates a file named as this input
	 * Information from the file read is placed in this new file 
	 */
	public static void fileCopier()
	{
		System.out.println("What file would you like to read?");
		Scanner s1 = new Scanner(System.in); 
        String fileName = s1.nextLine();

		
		FileReader fileReader;
		BufferedReader bufferedReader;
		String nextLine;
		FileOutputStream outputStream;
		PrintWriter printWriter;

		try
		{
			fileReader = new FileReader (fileName);
			bufferedReader = new BufferedReader(fileReader);
			
			System.out.println("Please enter output file name");
			fileName = s1.nextLine();
			
			outputStream = new FileOutputStream(fileName);
    		printWriter = new PrintWriter(outputStream); 
			
			while((nextLine = bufferedReader.readLine())!=null)
            {
            	System.out.println(nextLine);
            	printWriter.write(nextLine);
            	printWriter.println("\n");
            }
			
			bufferedReader.close();
			printWriter.close();
		}
			
		
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	}
	
	/**
	 * Reads file "mystery.txt"
	 * Calls cipherDecipherString and prints deciphered text
	 */
	public static void decipher ()
	{
		{
		
			FileReader fileReader;
			BufferedReader bufferedReader;
			String nextLine;


			try
			{
				fileReader = new FileReader ("mystery.txt");
				bufferedReader = new BufferedReader(fileReader);
				
				nextLine = bufferedReader.readLine();
				while (nextLine != null)
				{					
					System.out.println(cipherDecipherString(nextLine));
					nextLine = bufferedReader.readLine();
				   
				}

				bufferedReader.close();
			}
				
			
			catch (IOException e)
			{
				System.out.println(e);
			}
			
		}
	}
	
	// ## COPY THE FOLLOWING TWO LINES OF CODE AS FIELDS INTO YOUR 'FILES' CLASS - DON'T MODIFY THEM
	private static final String crypt1 = "cipherabdfgjk";
	private static final String crypt2 = "lmnoqstuvwxyz";

	// ## COPY THE FOLLOWING METHOD INTO YOUR 'FILES' CLASS TOO - AGAIN, DON'T MODIFY ITS CONTENTS
	/**
	 * method to encipher and decipher a given String using parallel arrays (crypt1 & crypt2)
	 *
	 * @param text A String containing text that is to be enciphered or deciphered
	 * @return A new String containing the result, e.g. the en/deciphered version of the String provided as an input
	 */
	private static String cipherDecipherString(String text)
	{
	    // declare variables we need
	    int i, j;
	    boolean found = false;
	    String temp="" ; // empty String to hold converted text

	    for (i = 0; i < text.length(); i++) // look at every character in text
	    {
	        found = false;
	        if ((j = crypt1.indexOf(text.charAt(i))) > -1) // is char in crypt1?
	        {           
	            found = true; // yes!
	            temp = temp + crypt2.charAt(j); // add the cipher character to temp
	        } 
	        else if ((j = crypt2.indexOf(text.charAt(i))) > -1) // and so on
	        {
	            found = true;
	            temp = temp + crypt1.charAt(j);
	        }

	        if (! found) // to deal with cases where char is NOT in crypt2 or 2
	        {
	            temp = temp + text.charAt(i); // just copy across the character
	        }
	    }
	    return temp;
	}

	/**
	 * Reads "details.txt" and gives average of each set of scores
	 */
	public static void details()
	{
		FileReader fileReader;
		BufferedReader bufferedReader;
		String nextLine;


		try
		{
			fileReader = new FileReader ("details.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			nextLine = bufferedReader.readLine();
			while (nextLine != null)
			{					
				String[]textLine = nextLine.split(" ");
				int total = 0;
				for(int i = 0; i<textLine.length-2; i++)
				{
					total += Integer.parseInt(textLine[i+2]);
				}
				
				System.out.printf("%s, %s: Final score is %.2f \n", textLine[1], textLine[0], (float)total/(textLine.length-2));
				
			nextLine = bufferedReader.readLine();	
			}

			bufferedReader.close();
		}
			
		
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	
	/**
	 * Checks if the file exists
	 * @param file path
	 * @return true or false
	 */
	private boolean check(String path)
	{
		File file = new File(path);
		return(file.exists() && file.canRead());
	}
	
	/**
	 * Creates a 2d array of integers and prints them in a .txt file
	 */
	public static void array()
	{
		FileOutputStream outputStream;
		PrintWriter printWriter;
		int arr[][] = {{69, 420, 563, 4, 45}, {911, 711, 77, 119, 666}, {20, 4, 80085, 93, 3475}};
    

        	try
        	{
        		outputStream = new FileOutputStream("2dArray.txt");
        		printWriter = new PrintWriter(outputStream); 
        		

                for (int[] index : arr) {
                    for (int number : index) {
                       
                            printWriter.write(number+" ");
                                          }
                }
                              
                
                printWriter.close();
        	}
        	
        	catch(IOException e)
        	{
        		System.out.println(e);
        	}
        	
        	System.out.println("File 2dArray.txt created");
	}
}


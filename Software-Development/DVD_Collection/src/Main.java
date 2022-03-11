import java.util.Scanner;

public class Main {

	/**
	 * Main method
	 * @param args parameters for the main method
	 */
	public static void main (String[] args)
	{
		Menu menu1 = new Menu();
		menu1.getCollection1().setCollection();
		menu1.getCollection1().display();
		menu1.getCollection1().totalCost();
		
		Boolean success = true;
		while(success)
		{
			success = menu1.menuOptions(success);	
		}
		
	}
}

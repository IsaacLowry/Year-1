import java.util.Scanner;

public class Menu {

	/**
	 * Collection object
	 */
	private Collection collection1;
	
	/**
	 * Menu constructor
	 */
	public Menu ()
	{
		collection1 = new Collection();
	}
	
	/**
	 * Displays and processes menu
	 * @param success flag
	 * @return boolean value
	 */
	public Boolean menuOptions (Boolean success)
	{
		System.out.println("1 - Display DVD Collection");
		System.out.println("2 - Enter DVD 1 Details");
		System.out.println("3 - Enter DVD 2 Details");
		System.out.println("4 - Enter DVD 3 Details");
		System.out.println("5 - Search DVDs");
		System.out.println("6 - Calculate Total Cost");
		System.out.println("7 - Exit Menu");
		
		Scanner s1 = new Scanner(System.in); 
		int input = s1.nextInt();
		s1.nextLine(); 
		
		if (input == 1)
		{
			collection1.display();
		}
		
		else if (input == 2)
		{
			System.out.println("What is the title of the DVD?"); 
			String title = s1.nextLine();
			
			System.out.println("Who directed the movie?");
			String director = s1.nextLine();
			
			System.out.println("How long is the film in minutes?");
			int runningTime = s1.nextInt();
			
			System.out.println("How much does the DVD cost?");
			double purchaseCost = s1.nextDouble();
			s1.nextLine();
			
			collection1.getDvd1().setDvd(title, director, runningTime, purchaseCost);
					
			
		}
		
		else if (input == 3)
		{
			System.out.println("What is the title of the DVD?");
			String title = s1.nextLine();
			
			System.out.println("Who directed the movie?");
			String director = s1.nextLine();
			
			System.out.println("How long is the film in minutes?");
			int runningTime = s1.nextInt();
			
			System.out.println("How much does the DVD cost?");
			double purchaseCost = s1.nextDouble();
			s1.nextLine();
			
			collection1.getDvd2().setDvd(title, director, runningTime, purchaseCost);
					
		}
		
		else if (input == 4)
		{
			System.out.println("What is the title of the DVD?");
			String title = s1.nextLine();
			
			System.out.println("Who directed the movie?");
			String director = s1.nextLine();
			
			System.out.println("How long is the film in minutes?");
			int runningTime = s1.nextInt();
			
			System.out.println("How much does the DVD cost?");
			double purchaseCost = s1.nextDouble();
			s1.nextLine();
			
			collection1.getDvd3().setDvd(title, director, runningTime, purchaseCost);
					
		}
		
		else if (input == 5)
		{
			System.out.println("What is the title of the DVD?");
			String title = s1.nextLine();
			collection1.searchCollection(title);
		}
	
		else if (input == 6)
		{
			collection1.totalCost();
		}
		
		else if (input == 7)
		{
			success = false;
			return success;
		}
		else {
			System.out.println("No such command");
		}
		return success;
		
	}

	/**
	 * gets collection object
	 * @return collection object
	 */
	public Collection getCollection1() {
		return collection1;
	}

	/**
	 * sets collection object
	 * @param collection1 collection object
	 */
	public void setCollection1(Collection collection1) {
		this.collection1 = collection1;
	}
}

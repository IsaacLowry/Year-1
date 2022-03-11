import java.util.Scanner;

public class Collection {

	/**
	 * dvd object
	 */
	private Dvd dvd1;
	/**
	 *dvd object 
	 */
	private Dvd dvd2;
	/**
	 * dvd object
	 */
	private Dvd dvd3;
	
	/**
	 * dvd collection constructor
	 */
	public Collection()
	{
		dvd1 = new Dvd();
		dvd2 = new Dvd();
		dvd3 = new Dvd();
		
	}
	
	/**
	 * sets dvd collection data
	 */
	public void setCollection () {
		System.out.println("What is the title of the DVD?");
		Scanner s1 = new Scanner(System.in); 
		String title = s1.nextLine();
		
		System.out.println("Who directed the movie?");
		String director = s1.nextLine();
		
		System.out.println("How long is the film in minutes?");
		int runningTime = s1.nextInt();
		
		System.out.println("How much does the DVD cost?");
		double purchaseCost = s1.nextDouble();
		s1.nextLine();

		dvd1.setDvd(title, director, runningTime, purchaseCost);
		
	
		System.out.println("What is the title of the DVD?");
		title = s1.nextLine();
		
		System.out.println("Who directed the movie?");
		director = s1.nextLine();
		
		System.out.println("How long is the film in minutes?");
		runningTime = s1.nextInt();
		
		System.out.println("How much does the DVD cost?");
		purchaseCost = s1.nextDouble();
		s1.nextLine();
		
		dvd2.setDvd(title, director, runningTime, purchaseCost);
		
		
		System.out.println("What is the title of the DVD?");
		title = s1.nextLine();
		
		System.out.println("Who directed the movie?");
		director = s1.nextLine();
		
		System.out.println("How long is the film in minutes?");
		runningTime = s1.nextInt();
		
		System.out.println("How much does the DVD cost?");
		purchaseCost = s1.nextDouble();
		
		dvd3.setDvd(title, director, runningTime, purchaseCost);
		
	}
	
	/**
	 * gets dvd 1 object
	 * @return dvd 1 object
	 */
	public Dvd getDvd1() {
		return dvd1;
	}

	/**
	 *  gets dvd 2 object
	 * @return dvd 2 object
	 */
	public Dvd getDvd2() {
		return dvd2;
	}

	/**
	 * gets dvd 3 object
	 * @return dvd 3 object
	 */
	public Dvd getDvd3() {
		return dvd3;
	}

	/**
	 * searches dvd collection by title
	 * @param title matches to dvd title
	 */
	public void searchCollection(String title) {
		String title1 = dvd1.getTitle();
		String title2 = dvd2.getTitle();
		String title3 = dvd3.getTitle();
	
		if (title.equals(title1))
		{
			System.out.println("DVD Found!");
			dvd1.display();
			
		}
		
		else if (title.equals(title2))
		{
			System.out.println("DVD Found!");
			dvd2.display();
			
		}
		
		else if (title.equals(title3))
		{
			System.out.println("DVD Found!");
			dvd3.display();
			
		} else {
			System.out.println("No DVDs found!");
		}
	}
	
	/**
	 * Calculates total cost of collection and displays it
	 */
	public void totalCost() 
	{
		double purchaseCost = 0;
		purchaseCost = dvd1.getPurchaseCost() + dvd2.getPurchaseCost() + dvd3.getPurchaseCost();
		System.out.println("The cost of all of the DVDs is equal to £" +purchaseCost);
	}
	
	/**
	 * Dispays dvds in the collection
	 */
	public void display()
	{
		dvd1.display();
		dvd2.display();
		dvd3.display();
	}
}

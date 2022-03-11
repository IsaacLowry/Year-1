/**
 * @author Isaac Lowry
 *
 */
public class Dvd 
{
	/**
	 * Title of movie
	 */
	private String title;		//name of the film
	/**
	 * Director name
	 */
	private String director;	//name of the director
	/**
	 * Length of movie
	 */
	private int runningTime;	//how long the film lasts listed in minutes
	/**
	 * Cost of DVD
	 */
	private double purchaseCost;	//how much the DVD costs in pounds
	
	/**
	 * Dvd class constructor
	 */
	public Dvd()
	{
		title = "";
		director = "";
		runningTime = 0;
		purchaseCost = 0;		
		
	}
	
	/**
	 * Sets the fields of the dvd
	 * @param movieName name of the movie
	 * @param movieDirector name of the director
	 * @param movieRunningTime length of movie
	 * @param dvdPurchaseCost cost of dvd
	 */
	public void setDvd (String movieName, String movieDirector, int movieRunningTime, double dvdPurchaseCost)
	{
		title = movieName;
		director = movieDirector;
		runningTime = movieRunningTime;
		purchaseCost = dvdPurchaseCost;
	}
	
	/**
	 * Displays dvd details
	 */
	public void display ()
	{
		System.out.println("Movie Name: "+title);
		System.out.println("Director: "+director);
		System.out.println("Running Time: "+runningTime);
		System.out.println("Purchase Cost: £"+purchaseCost);
		System.out.println("");
	}

	
	
	/**
	 * gets movie title
	 * @return movie title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * sets movie title
	 * @param title movie title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * gets director name
	 * @return director name
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * sets director name
	 * @param director director name
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * gets movie running time
	 * @return movie running time
	 */
	public int getRunningTime() {
		return runningTime;
	}
	/**
	 * sets movie running time
	 * @param runningTime movie running time
	 */
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	/**
	 * gets purchase cost
	 * @return purchase cost
	 */
	public double getPurchaseCost() {
		return purchaseCost;
	}
	/**
	 * sets purchase cost
	 * @param purchaseCost purchase cost
	 */
	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}
}
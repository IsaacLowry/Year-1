
public class Main {
	
	/**
	 * Creates an integer as an instance variable
	 */
	public static int indent = 0;
	/**
	 * Main method
	 * @param args Main Method arguments
	 */
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.mainMenu();
		
	}
	
	 /**
	 * Displays the tree
	 * @param p
	 */
	public static void displayTree(Treenodes p)
	    {
	      int i;

	        if (p != null)
	        {
	           indent += 6;
	           displayTree(p.right);

	           for (i=6; i<indent; i=i+6)
	              System.out.print ("\t");
	              
	              
	            System.out.println("      " + p.studentId);

	            displayTree(p.left);

	            indent -= 6;
	         }
	     }
}

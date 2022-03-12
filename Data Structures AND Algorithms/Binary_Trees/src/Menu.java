import java.util.Scanner;

public class Menu {
	
	/**
	 * New tree object created
	 */
	private static Tree tree = new Tree();

	/**
	 * Prints menu and processes input
	 */
	public void mainMenu() {
		
		while(true) {
			System.out.println("1 - Insert student marks");
			System.out.println("2 - Find a student");
			System.out.println("3 - Delete a student");
			System.out.println("4 - Print in order");
			System.out.println("5 - Print post order");
			System.out.println("6 - Print pre order");
			System.out.println("7 - Save progress");
			System.out.println("8 - Load progress");
			System.out.println("0 - Exit");
			Scanner s2 = new Scanner(System.in);
			String input = s2.nextLine();
			switch (input) {
				case "1":
					insertChoice();
					continue;
				case "2":
					findChoice();
					continue;
				case "3":
					deleteChoice();
					continue;
				case "4":
					tree.printInOrder(tree.root);
					continue;
				case "5":
					tree.printPostOrder(tree.root);
					continue;
				case "6":
					tree.printPreOrder(tree.root);
					continue;
				case "7":
					tree.save();
					System.out.println("Successfully saved");
					continue;
				case "8":
					tree.load("tree.txt");
					continue;					
				case "0":
					return;
				default:
					System.out.println("No such menu parameter");
			}
		}
	}	
	
	/**
	 * Prints instructions
	 * Processes input
	 * Passes int into insert method
	 */
	public void insertChoice() {
		while(true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the student ID followed by the mark - eg 64 95");
			System.out.println("Enter 0 to exit");
			String pInput = s1.nextLine();
			if (pInput.equals("0")) {
				break;
			}
		
			
			try {
				String[] parts = pInput.split(" ");
				String id = parts[0];
				String mark = parts[1];
				int userID = Integer.parseInt(id);
				int userMark = Integer.parseInt(mark);
				tree.root = tree.insert(userMark, userID, tree.root);
			}
			
			catch (Exception e) {
				System.out.println("Wrong Input");
				break;
			}
		}
	}
	
	/**
	 * Prints instructions
	 * Processes input
	 * Passes int into find method
	 * Prints whether it was found or not
	 */
	public void findChoice() {
		while(true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the student ID you are searching for - eg 902");
			System.out.println("Enter 0 to exit");
			String pInput = s1.nextLine();
			if (pInput.equals("0")) {
				break;
			}
			
			try {
				int userID = Integer.parseInt(pInput);
				tree.find(tree.root, userID);
				Treenodes tmp = tree.find(tree.root, userID);
				if (tmp != null)
				{
					System.out.println("Student Id - "+tmp.studentId+ "\nExam mark - "+tmp.examMark);
				}
				if (tmp == null)
				{
					System.out.println("The entry does not exist");
				}
				
			}
			
			catch (Exception e) {
				System.out.println("Wrong Input");
				break;
			}
		}
	}
	
	/**
	 * Prints instructions
	 * Processes input
	 * Passes int into delete method
	 */
	public void deleteChoice() {
		while(true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the student ID you wish to delete - eg 902");
			System.out.println("Enter 0 to exit");
			String pInput = s1.nextLine();
			if (pInput.equals("0")) {
				break;
			}
			
			try {
				int userID = Integer.parseInt(pInput);
				tree.root = tree.delete(tree.root, userID);	
			}
			
			catch (Exception e) {
				System.out.println("Wrong Input");
				break;
			}
		}
	}
}

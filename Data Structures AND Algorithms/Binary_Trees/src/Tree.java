import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Tree {
	
	/**
	 * Create an instance of Treenodes
	 */
	public Treenodes root;
	
	/**
	 * Inserts a node into the tree containing a mark and a Student ID
	 * @param mark
	 * @param id
	 * @param node
	 * @return node
	 */
	public Treenodes insert(int mark, int id, Treenodes node) {
		
		if(node == null) {
			return new Treenodes(mark, id);
		}
		
		if(id < node.studentId) {
			node.left = insert(mark, id, node.left);
		}
		
		else if(id > node.studentId) {
			node.right = insert(mark, id , node.right);
		}
		
		else {
			System.out.println("Error - entry already exists");
		}
		return node;
	}
	
	/**
	 * Prints tree in order
	 * @param node
	 */
	public void printInOrder(Treenodes node) {
		if(node != null) {
			printInOrder(node.left);
			System.out.println("Student Id - "+node.studentId+ "\nExam mark - "+node.examMark);
			printInOrder(node.right);
			
		}
	}
	
	/**
	 * Prints tree in post order
	 * @param node
	 */
	public void printPostOrder(Treenodes node) {
		if(node != null) {
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.println("Student Id - "+node.studentId+ "\nExam mark - "+node.examMark);
			
			
		}
	}
	
	/**
	 * Prints tree in pre order
	 * @param node
	 */
	public void printPreOrder(Treenodes node) {
		if(node != null) {
			System.out.println("Student Id - "+node.studentId+ "\nExam mark - "+node.examMark);
			printPreOrder(node.left);
			printPreOrder(node.right);
			
		}
	}
	
	/**
	 * Finds the node in the tree using the Student ID
	 * @param node
	 * @param id
	 * @return node
	 */
	public Treenodes find(Treenodes node,int id) {
		Treenodes search = null;
		if(node != null) {
			if(id < node.studentId) {
				search = find(node.left, id);
			}
			if(id > node.studentId) {
				search = find(node.right, id);
			}
			if(id == node.studentId) {
				return node;
			}
		}
		return search;
	}
	
	/**
	 * Searches for node using the Student ID
	 * Prints an error if the node does not exist
	 * Removes node from the tree
	 * Prints a message if it has been successfully deleted
	 * @param node
	 * @param id
	 * @return node
	 */
	public Treenodes delete(Treenodes node, int id) {
		if(node == null) {
			System.out.println("Entry does not exist");
			return node;
		}
		if(id < node.studentId) {
			node.left = delete(node.left, id);
		}
		if(id > node.studentId) {
			node.right = delete(node.right, id);
		}
		if(id == node.studentId) {
			if(node.left == null) {
				System.out.println("Successfully deleted");
				return node.right;
			}
			else if (node.right == null) {
				System.out.println("Successfully deleted");
				return node.left;
			}
			Treenodes tmp = successor(node.right);
			node.studentId = tmp.studentId;
			node.examMark = tmp.examMark;
			node.right = delete(node.right, node.studentId);
		}
		return node;
	}
	
	/**
	 * Assigns node to the left node
	 * @param node
	 * @return node
	 */
	private Treenodes successor(Treenodes node) {
		if(node.left != null) {
			node = successor(node.left);
		}
		return node;
	}
	
	/**
	 * Traverses the tree in order
	 * @param node
	 * @return str
	 */
	public String traverseInOrder(Treenodes node) {
		String str = "";
		if(node != null) {
			str += traverseInOrder(node.left);
			str += String.format("%d %d \n", node.examMark, node.studentId);
			str += traverseInOrder(node.right);
		}
		return str;
	}
	
	/**
	 * Saves current tree in a .txt file
	 */
	public void save() {
		try {
			PrintWriter writer = new PrintWriter("tree.txt", "UTF-8");
			writer.println(traverseInOrder(root));
			writer.close();
		}
		
		catch(IOException e) {
			System.out.println("Error writing the file");
		}
	}
	/**
	 * Loads the saved .txt file as current tree
	 * Prints if it has been successfully loaded
	 * Prints errors if it cannot be loaded
	 * @param fName
	 */
	public void load(String fName) {
		
		String line;
		try {
			BufferedReader in = new BufferedReader(new FileReader(fName));
			while((line = in.readLine()) != null) {
				if(line.equals("")) {
					continue;
				}
				String[] lParts = line.split(" ");
				root = insert(Integer.parseInt(lParts[0]), Integer.parseInt(lParts[1]), root);
			}
			System.out.println("The file has been successfully loaded");
		}
		
		catch (FileNotFoundException f) {
			System.out.println("File not found");
		}
		catch (IOException f) {
			System.out.println("Error reading file");
		}
	}
}

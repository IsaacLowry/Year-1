import java.util.Scanner;

public class RPNCalculator {

	/**
	 * Prints menu and processes input
	 */
	public void menu() {
		
		while(true) {
			System.out.println("1 - Perform Calculation");
			System.out.println("2 - More Information");
			System.out.println("3 - Test Cases");
			System.out.println("4 - Exit");
			Scanner s2 = new Scanner(System.in);
			String input = s2.nextLine();
			switch (input) {
				case "1":
					processEquation();
					continue;
				case "2":
					rpnInformation();
					continue;
				case "3":
					Tester test = new Tester();
					test.stackTest();
					continue;
				case "4":
					return;
				default:
					System.out.println("No such menu parameter");
			}
		}
	}
	/**
	 * Processes the equation
	 * Calls calculate method if variable is valid
	 */
	public void processEquation() {
		while(true) {
			String[] var = inputCheck();
			if (var == null) {
				return;
			}
			calculate(var);
		}
	}
	
	/**
	 * Checks which characters are being entered using the delimiter
	 * @return sliceData
	 */
	public String[] inputCheck() {
			System.out.println("Please enter an equation - eg 1 2 +");
			System.out.println("Enter 0 to exit");
			Scanner s1 = new Scanner(System.in); 
			String input = s1.nextLine();
			if (input.equals("0")) {
				return null;
			}
			String[] sliceData = input.split(" ");
			return sliceData;
	}
	
	/**
	 * Assigns the input to an integer if valid
	 * @param sliceData
	 */
	public void calculate (String[] sliceData)
	{
		Stack rpnStack = new Stack();
		for (String element : sliceData) {
			try {
				int var = Integer.parseInt(element);
				rpnStack.push(var);
			}
			
			catch (NumberFormatException nfe) {				
				try {
					int a = rpnStack.pop();
					int b = rpnStack.pop();
					int result = operatorCalc(element,a,b);
					rpnStack.push(result);
				}
				
				catch(RPNException rpne) {
					break;
				}
			}
		}

		try {
			if (rpnStack.length != 1) {
				throw new RPNException ("Wrong input");
			}
			int result = rpnStack.pop();
			System.out.println("Answer = "+result);
		}
		
		catch(RPNException rpne) {
			System.out.println(rpne.getMessage());
			return;
		}
	}
	
	/**
	 * Performs the calculation
	 * @param op
	 * @param a
	 * @param b
	 * @return a +/-/* b
	 * @throws RPNException
	 */
	public int operatorCalc(String op, int a, int b) throws RPNException {
		switch (op) {
			case "-":
				return a-b;
			case "+":
				return a+b;
			case "*":
				return a*b;
			default :
				throw new RPNException("Unknown operator");
		}
	}
	
	/**
	 * Prints information about the RPN Calculator
	 */
	public void rpnInformation() {
		System.out.println("What is an RPN (Reverse Polish Notation?");
		System.out.println("RPN is a mathematical notation in  which the operators follow their operands.");
		System.out.println("This contrasts to the Polish Notation or PN where the opposite applies.");
		System.out.println("\nThis calculator uses the RPN format.");
		System.out.println("For more information visit - https://en.wikipedia.org/wiki/Reverse_Polish_notation");
	}
}

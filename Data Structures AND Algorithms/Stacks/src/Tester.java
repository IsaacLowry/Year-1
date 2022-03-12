
public class Tester {
    
    /**
     * Method for testing calculation scenarios
     */
    public void stackTest() {
    	Stack stackInstance = new Stack();
    	//test 1 - popping from a non-empty stack
    	try {
    		stackInstance.push(10);
    		System.out.println(stackInstance.pop());
    	}
    	catch (RPNException e) {
    		System.out.println(e);
    	}
    	stackInstance = new Stack();
    	//test 2 - popping from an empty stack
    	try {
    		stackInstance.pop();
    	}
    	catch (RPNException e) {
    		System.out.println(e);
    	}
    	stackInstance = new Stack();
    	//test 3 - performing an RPN Calculation
		RPNCalculator testCalc = new RPNCalculator();
		String[] sliceData1 = {"2", "3", "+"};
		System.out.println("Testing Data: 2 3 +");
		System.out.println("Expected Answer: 5");
		testCalc.calculate(sliceData1);
		

		stackInstance = new Stack();
    	//test 4 - performing an RPN Calculation
		String[] sliceData2 = {"2", "3", "4", "+"};
		System.out.println("Testing Data: 2 3 4 +");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData2);
		
		stackInstance = new Stack();
    	//test 5 - performing an RPN Calculation
		String[] sliceData3 = {"2", "+"};
		System.out.println("Testing Data: 2 +");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData3);
		
		stackInstance = new Stack();
    	//test 6 - performing an RPN Calculation
		String[] sliceData4 = {"5", "3", "-"};
		System.out.println("Testing Data: 5 3 -");
		System.out.println("Expected Answer: -2");
		testCalc.calculate(sliceData4);
		
		stackInstance = new Stack();
    	//test 7 - performing an RPN Calculation
		String[] sliceData5 = {"3", "5", "-"};
		System.out.println("Testing Data: 3 5 -");
		System.out.println("Expected Answer: 2");
		testCalc.calculate(sliceData5);
		
		stackInstance = new Stack();
    	//test 8 - performing an RPN Calculation
		String[] sliceData6 = {"4", "4", "*"};
		System.out.println("Testing Data: 4 4 *");
		System.out.println("Expected Answer: 16");
		testCalc.calculate(sliceData6);
		
		stackInstance = new Stack();
    	//test 9 - performing an RPN Calculation
		String[] sliceData7 = {"*"};
		System.out.println("Testing Data: *");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData7);
		
		stackInstance = new Stack();
    	//test 10 - performing an RPN Calculation
		String[] sliceData8 = {"0", "0", "*"};
		System.out.println("Testing Data: 0 0 *");
		System.out.println("Expected Answer: 0");
		testCalc.calculate(sliceData8);
		
		stackInstance = new Stack();
    	//test 11 - performing an RPN Calculation
		String[] sliceData9 = {"a", "b", "+"};
		System.out.println("Testing Data: a b +");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData9);
		
		stackInstance = new Stack();
    	//test 12 - performing an RPN Calculation
		String[] sliceData10 = {"1", "+", "2"};
		System.out.println("Testing Data: 1 + 2");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData10);
		
		stackInstance = new Stack();
    	//test 13 - performing an RPN Calculation
		String[] sliceData11 = {"+", "5", "5", "6","*"};
		System.out.println("Testing Data: + 5 5 6 *");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData11);
		
		stackInstance = new Stack();
    	//test 14 - performing an RPN Calculation
		String[] sliceData12 = {"-", "6", "-"};
		System.out.println("Testing Data: - 6 -");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData12);
		
		stackInstance = new Stack();
    	//test 15 - performing an RPN Calculation
		String[] sliceData13 = {"5", "h", "*"};
		System.out.println("Testing Data: 5 h *");
		System.out.println("Expected Answer: Wrong input");
		testCalc.calculate(sliceData13);
    }
}

public class Stack {
	

	/**
	 * New List object created
	 */
	private List stackList;
	/**
	 * Creates an integer
	 */
	public int length;
	
	/**
	 * Constructor for objects of class Stack
	 */
	Stack() {
		stackList = new List();
		length = 0;
	}
	
	/**
	 * Adds integer to the stack
	 * @param stackInt
	 */
	public void push(int stackInt)
	{
		stackList.addToList(stackInt);
		length++;
	}
	
	/**
	 * Removes integer from stack
	 * @return tmp.getInteger
	 * @throws RPNException
	 */
	public int pop() throws RPNException
	{
		if (stackList.getHead() == null)
		{
			throw new RPNException("Stack is empty");
			// to do throw an exception
		}
		

		length--;
		ListNode tmp = stackList.deleteFromStart();	
		return tmp.getInteger();
	}
	
	
	
}

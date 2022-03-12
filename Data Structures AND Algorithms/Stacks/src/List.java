
/**
 * Lab 1
 * 
 * @author AC12001 Team
 * @version January 2013
 */
public class List 
{
    private ListNode head;
    
    public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	/**
     * Constructor for objects of class List
     * Create a head
     */
    public List()
    {
        head = null;
    }

     /**
     * Add a new node at the start of a list
     * 
     * @param  data to add
     * @return nothing    
     */
    public void addToList(int integer)
    {
        ListNode  marker;
        ListNode  newOne;
        
        newOne = new ListNode(integer);        
        newOne.setNext(head);
        
        head = newOne;
    }
 

     
     /**
      * Deletes the node at start of list
     * @return nodeToDelete
     */
    public ListNode deleteFromStart()
     {
    	 //  Declare a marker/variable called "nodeToDelete" which will point to a ListNode
    	 ListNode nodeToDelete = null;
    	 
    	 //	Before deleting a node, check if the stack is empty
    	 if (head == null)
    	 {
    		 //  If it is empty, return null
    		 return null;
    	 }
    	 
    	 else
    	 {
    		 //	make nodeToDelete point to the note pointed to by head
    		 nodeToDelete = head;
    		 head = nodeToDelete.getNext();
    		 //  return nodeToDelete
    		 return nodeToDelete;
    	 }
	 
     }
}

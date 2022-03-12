
/**
 * Performs actions on the list's nodes
 * 
 * @author AC12001 Team
 * @version January 2013
 */
public class ListNode    
{
    // instance variables
    private int integer;
    private ListNode next;


    /**
     * Constructor for objects of class List
     */
    public ListNode(int integer)
    {
        // initialise instance variables
        this.integer = integer;
        this.next = null;
    }
    
     /**
     * Get the next node
     * 
     * @param  none
     * @return the next node
     */
    public ListNode getNext()
    {
        return next;
    }
     
     /**
     * Get the integer
     * 
     * @param  none
     * @return mark at this node
     */
    public int getInteger()
    {
        return integer;
    }
  

     /**
     * Set the next node
     * 
     * @param  the node to be added at this node's next
     * @return nothing
     */
    public void setNext(ListNode next)
    {
        this.next = next;
    }
    

}

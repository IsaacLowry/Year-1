
public class Treenodes {
	/**
	 * Creates an integer
	 */
	public int examMark;
	/**
	 * Creates an integer
	 */
	public int studentId;
	/**
	 * Creates an instance of Treenodes
	 */
	public Treenodes left;
	/**
	 * Creates an instance of Treenodes
	 */
	public Treenodes right;
	/**
	 * Creates an instance of Treenodes
	 */
	public Treenodes parent;
	
	/**
	 * Constructor for class Treenodes
	 * @param mark
	 * @param id
	 */
	Treenodes(int mark, int id) {
		this.examMark = mark;
		this.studentId = id;
	}
}

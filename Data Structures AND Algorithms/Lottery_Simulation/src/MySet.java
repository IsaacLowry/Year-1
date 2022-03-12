import java.util.HashSet;
import java.util.Set;

public class MySet {
	
	/**
	 * Private Set created
	 */
	private Set<Integer> set = new HashSet<Integer>();
	
	/**
	 * Method for adding integer to set
	 * @param n
	 * @return n
	 */
	public Boolean add(int n) {
		return set.add(n);
	}
	
	/**
	 * Intersection method
	 * @param intersect
	 * @return tmpset
	 */
	public Set<Integer> intersection(MySet intersect) {
		
		Set<Integer> tmpset = set;
		tmpset.retainAll(intersect.set);
		return tmpset;
	}
	
	/**
	 * Method for returning set size
	 * @return set.size()
	 */
	public int size() {
		return set.size();
	}
	
	/**
	 * Clears set
	 */
	public void clear() {
		set.clear();
	}
}

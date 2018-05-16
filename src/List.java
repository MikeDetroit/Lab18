import java.util.Arrays;

public class List {

	private String[] items = new String[100];
	private int count = 0;

	public int length() {

		return count;
	}

	// is empty method
	public boolean isEmpty() {
		// if(count == 0) { //determining if list is empty
		// return true;
		// }
		//
		// ternary operator (below) - short hand code for an if else statement
		// condition ? true : false
		// boolean check = count == 0 ? true:false;
		// return check;
		// does the same as the below return statement
		return count == 0 ? true : false;

	}

	// is full method
	public boolean isFull() {
		if (count == items.length) {

			return true;
		}
		return false;

	}

	// insert method
	public boolean insert(String newItem) {
		if (count == items.length) { // telling me my list is full and i cannot add any values
			return false; 
		}
		items[count] = newItem;
				count ++; //keeping track of how many items in list
		return true;
		
	}

	@Override
	public String toString() {
		return "List [items=" + Arrays.toString(items) + "]";
	}
	
	

}

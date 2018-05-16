import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = {7, 4, 8, 9, 23, 9, 45, 2};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //once the array is sorted, it maintains the sort

		System.out.println(Arrays.toString(arr)); //binary search is a divide and conquer 
		int index = Arrays.binarySearch(arr, 9); //will check second half of the array first
		System.out.println(index);
		
		
		
		
		
	}

}

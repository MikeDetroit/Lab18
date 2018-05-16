import java.util.HashMap;

//Alli Farr & Mike DeCoopman 5-16-18 Lab 18

public class AlgorithmMain {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 7, 9, 3, 1, 1 };

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			char[] charr = String.valueOf(arr[i]).toCharArray();
			for (int j = 0; j < charr.length; j++) {
				if (map.containsKey(charr[j])) {
					map.put(charr[j], map.get(charr[j]) + 1);
				} else {
					map.put(charr[j], 1);

				}
			}
		}
		System.out.println(map);

	}

}

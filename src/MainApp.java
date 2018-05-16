
public class MainApp {

	public static void main(String[] args) {
		List list = new List(); // this is example 1 using an array under the hood

		list.insert("Grand Circus");
		list.insert("Park");
		list.insert("hello");
		list.insert("mike");
		list.insert("hello");
		list.insert("alli");

		// System.out.println(list);
		// System.out.println(list.isFull());
		// System.out.println(list.isEmpty());

		// example #2
		LinkedList list2 = new LinkedList();
		list2.addAtStart("Vicki");
		list2.addAtStart("Tim");
		list2.addAtStart("Jonah");
		list2.addAtStart("mike");
		list2.addAtStart("Vicki");
		list2.addAtStart("alli");
		list2.addAtStart("mike");
		list2.addAtStart("ben");

		list2.removeAll("mike");

		list2.printAllNodes();

		System.out.println();

		list2.printReverse();

	}

}

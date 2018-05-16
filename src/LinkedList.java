import java.util.Stack;

//Alli Farr & Mike DeCoopman 5-16-18 Lab 18

public class LinkedList {
	private Node head;
	private Node current;
	public int count;

	public LinkedList() {
		head = new Node();
		current = head;
	}

	public void addAtStart(Object data) { // methods that adds new node to beginning of linked list
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next; // new node will have a reference of the head's next reference
		head.next = newNode; // now the head will refer to the new node
		count++;
	}

	public void removeFromStart() {
		if (count == 1) {
			head = null;
			current = null;
			count = 0;
		}
		if (count > 1) {
			head = head.next;
			count--;
		} else {
			System.out.println("There are no elements in the list!");
		}
	}

	public void printAllNodes() {
		System.out.println("Head -->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value); // <-- prints the VALUE of curr
			System.out.println("-->");
		}
		System.out.println("NULL");

	}

	public void removeAll(Object o) {
		current = head;
		if (head == null) { // list is empty
			return;
		}

		// accounting for situation where o is at the head of the list

		if (current.value == o) {
			head = current.next;
		}

		// while loop to remove all consecutive occurrences of o
		while (current.next != null) {
			while (current.next.value == o) {
				current.next = current.next.next;
				count--;
			}
			current = current.next;
		}

	}

	public void printReverse() {

		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	// still working here..
	public void printReverse(Node node) {
		if (node != null) {
			printReverse(node.next);
			System.out.print("  " + node.value);
		}
	}

	// maybe this is a better way....
//	public void printReverse(LinkedList node) {
//		Stack<LinkedList> stack = new Stack<>();
//		while (node != null) {
//			stack.push(node);
//			node = node.next;
//		}
//		while (!stack.empty())
//			System.out.println(stack.pop());
//	}

}

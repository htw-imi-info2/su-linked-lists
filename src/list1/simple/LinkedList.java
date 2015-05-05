package list1.simple;

public class LinkedList {
	Node first;

	public void add(Object data) {
		Node newNode = new Node(data, null);
		if (first == null)
			first = newNode;
		else {
			Node current = first;
			while (current.next != null)
				current = current.next;
			current.next = newNode;
		}

	}

	public void addFirst(Object data) {
		Node newNode = new Node(data, null);
		if (first == null)
			first = newNode;
		else {
			newNode.next = first;
			first = newNode;
		}

	}

	@Override
	public String toString() {
		return first.toString();
	}

	public Object get(int index) {
		if (index == 0)
			return first.data;
		int i = 0;
		Node current = first;
		while ((i < index) && (current != null)) {
			current = current.next;
			i++;
		}
		if (current == null)
			return null;
		return current.data;
	}

}

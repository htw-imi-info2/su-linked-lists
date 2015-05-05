package list1.simple;

public class Node {

	Object data;
	Node next;

	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		if (next == null)
			return data.toString();
		else
			return data.toString() + ", " + next.toString();
	}
}

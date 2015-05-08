package list4.iterable;

public class Node<E extends Comparable<E>>  {
	//implements Comparable<Node<E>>

	E data;
	Node<E> next;

	public Node(E data, Node<E> next) {
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

	//@Override
	public int compareTo(Node<E> o) {
		return data.compareTo(o.data);
	}

}

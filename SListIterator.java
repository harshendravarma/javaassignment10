package assignment10;

public class SListIterator {
	Node current;

	SListIterator(Node n) {
		this.current = n;
	}

	public boolean hasNext() {
		return current.next != null;
	}

	public Node next() {
		current = current.next;
		return current;
	}

	public void insert(String data) {
		current.next = new Node(data, current.next);
		current = current.next;
	}

	public void remove() {
		if (current.next != null) {
			current.next = current.next.next;
		}
	}
}

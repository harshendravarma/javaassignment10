package assignment10;

public class SListIterator {
	
	Node current;

	SListIterator(Node n) {
		this.current = n;
	}
	
	/*checks if a node has next node or not*/
	public boolean hasNext() {
		return current.next != null;
	}
	
	/*retrun next node*/
	public Node next() {
		current = current.next;
		return current;
	}
	
	/*inserts a new node given the data of that node*/
	public void insert(String data) {
		current.next = new Node(data, current.next);
		current = current.next;
	}
	
	/*removes the current node*/
	public void remove() {
		if (current.next != null) {
			current.next = current.next.next;
		}
	}
	
}

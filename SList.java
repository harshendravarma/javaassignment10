package assignment10;

public class SList {
	
	private Node head = new Node(null);

	SListIterator iterator() {
		return new SListIterator(head);
	}
	
	/*converts linkedlist  to string format*/
	public String toString() {
		if (head.next == null) {
			return "list is empty";
		}
		System.out.print("SList is  [");
		SListIterator iterator = this.iterator();
		StringBuilder s = new StringBuilder();
		while (iterator.hasNext()) {
			s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
		}
		return s + "]";
	}
	
}

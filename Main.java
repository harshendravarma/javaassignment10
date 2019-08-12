package assignment2;
class Node{
	String data;
	Node next;
	Node(String data,Node next){
		this.data=data;
		this.next=next;
	}
	Node(String data){
		this(data,null);
	}
	public String toString() {
		if(data == null) return "null";
		return data;
	}
}

class SList{
	private Node head=new Node(null);
	SListIterator iterator() { return new SListIterator(head); }
	public String toString(){
		if(head.next==null) {
			return "list is empty";
		}
		System.out.print("SList is  [");
		SListIterator iterator = this.iterator();
		StringBuilder s = new StringBuilder(); 
		while(iterator.hasNext()) {
			s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
		}
		return s + "]";
		
		}	
	
}
class SListIterator{
	Node current;
	SListIterator(Node n){
		this.current=n;
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
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
}
	
public class Main {
	public static void main(String[] args) {
		SList list1= new SList();
		SListIterator siterator=list1. iterator();
		System.out.println(list1);
		siterator.insert("1");
		siterator.insert("2");
		System.out.println(list1);
		SListIterator siterator2=list1. iterator();
		siterator2.remove();
		System.out.println(list1);
		}
	}














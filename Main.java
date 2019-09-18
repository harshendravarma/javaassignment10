package assignment10;

public class Main {

	public static void main(String[] args) {
		
		SList list1 = new SList();
		SListIterator siterator = list1.iterator();
		System.out.println(list1); 				//list is empty
		siterator.insert("1");
		siterator.insert("2");
		System.out.println(list1);               //SList is  [1, 2]
		SListIterator siterator2 = list1.iterator();
		siterator2.remove();
		System.out.println(list1);    			//SList is  [2]

	}

}

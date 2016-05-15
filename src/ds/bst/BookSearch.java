package ds.bst;

import ds.list.SingleLinkedList;

public class BookSearch {
	private BST<String, String> bst;
	
	public BookSearch(){
		bst = new BST<String, String>();
	}
	
	public void add(String name, String location){
		bst.insert(name, location);
		
	}
	
	public String remove(String name){
		String location = bst.remove(name);
		return location;
		

	}
	
	public String get(String name){
		String location= bst.find(name);
		return location;
	}
	
	public int size(){
		return bst.size();
	}
	
	public SingleLinkedList<String> order(){
		SingleLinkedList<String> nameList = new SingleLinkedList<String>();
		bst.inorder(nameList);
		return nameList;
	}
	
	public String first(){
		return bst.first();
	}
	
	public String last(){
		return bst.last();
	}
	
	public int range(String from, String to){
		
		// fill your code

		return 0;
	}
	
}

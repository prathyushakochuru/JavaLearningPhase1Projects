package datastpkg;
import java.util.LinkedList;

public class LinkedListOp {
	
	private Node head;
	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next=null;
		}
	}

	public void delete(int pos) {
		
		
		Node temp = head;
		if(this.head==null) {
			
			System.out.println("linkedList is empty - Nothing to delete!");
			
		}
		if(pos ==0)
		{
			head = temp.next;
		}
		
		for(int i=0; temp!=null && i<pos-1; i++)
		{
			temp = temp.next;
		}
		Node next = temp.next.next;
		
		temp.next = next;
		
	}
	
	public void push(int data) {
		Node node=new Node(data);
		node.next=null;
		if(this.head==null) {
		
			this.head=node;
		}
		else {
			Node findLast=this.head;
			while(findLast.next!=null) {

				findLast=findLast.next;
			}
			findLast.next=node;
		}
		
	}
	
	 public void printList() 
	    { 
		 System.out.println("Printing linkedlist: ");
			Node findLast=this.head;
		
			while(findLast.next!=null) {
				System.out.println(findLast.data);
				findLast=findLast.next;
			}
	    }

}

//Author: Prathyusha Kochuru
//Date: 02/22/2021
//LinkedList - Adding & Deleting

package datastpkg;

public class MainLinkedlist {

	public static void main(String[] args) {
		

		LinkedListOp list = new LinkedListOp();
		
		list.push(20);
		list.push(76);
		list.push(90);
		list.push(10);
		list.push(60);
		list.push(900);
		list.push(210);
		
		System.out.println("Before deleting second element--");
		list.printList();
		
		list.delete(1);
		
		System.out.println("\nAfter deleting second element--");
		list.printList();
		

	}

}

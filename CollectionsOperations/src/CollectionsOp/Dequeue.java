package CollectionsOp;
import java.util.*;
import java.util.Iterator;
//Dequeue Operations - can add elements on either end

//Author: Prathyusha Kochuru
//Date: 02/08/2021
public class Dequeue {

	public static void main(String[] args) {
		 Deque<String> dq= new LinkedList<String>();
		 //adding elements in dequeue
	      dq.add("a.txt");
	      //add to first
	      dq.addFirst("b.txt");
	      //add to last
	      dq.addLast("c.txt");
	      //add to fist
	      dq.push("d.txt");
	      //add to last
	      dq.offer("e.txt");
	      //add to first
	      dq.offerFirst("f.txt");
	      //add to last
	      dq.offerLast("a.txt");
	      
	      //reading dequeue 
	      System.out.println("Printing dequque: " + dq);
	      
	      //reading through Iterator
	      System.out.println("Printing using an Iterator: ");
	      Iterator itr = dq.iterator();
	      while (itr.hasNext()) {
	         System.out.print(itr.next() + " ");
	      }
	      
	      System.out.println("First element of the dequeue is: " + dq.peek());
	      
	      //deleting from the head
	      String strpop = dq.pop();
	      System.out.println("Pop - Element removed from the head of the dequeue: " + strpop);
	      System.out.println("Deque after pop: " + dq);
	      
	      //search an element in dequeue
	      System.out.println("Does the deque contain file name z.txt: " + dq.contains("z.txt"));
	      
	      //delete first and last elements from dequeue
	      dq.removeFirst();
	      dq.removeLast();
	      System.out.println("Deque after removing the first and last elements is: " + dq);

	}

}

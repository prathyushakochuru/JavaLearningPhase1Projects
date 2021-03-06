/**
 Queue CRUD Operations
 */
package CollectionsOp;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.ConcurrentModificationException;

//Author: Prathyusha Kochuru
//Date: 02/08/2021

public class QueueCRUD {

	public static void main(String[] args) {

		//declare a queue 
		
		Queue<Integer> q1 = new LinkedList <>();
		
		//adding queue elements
		q1.add(345);
		q1.add(5765);
		q1.add(898);
		q1.add(null);
		q1.add(6576);
		q1.add(45);
		q1.add(34);
		q1.add(456);
		q1.add(null);
		q1.add(674);
		q1.add(null);
		q1.add(234);
		
		//reading queue elements
		System.out.println("Queue q1: " + q1);
		
		//inserting another element at rear end 
		q1.add(345);
		System.out.println("Queue q1 after inserting an element at the end: " + q1);
		
		//deleting the first element which is 345
		int n1 = q1.remove();
		System.out.println("Queue q1 after deleting first num " + n1 + ": " + q1);
		
		//getting the first element
		int h1 = q1.peek();
		System.out.println("The first element is: " + h1);
		
		//get size
		int size = q1.size();
		System.out.println("The size of the queue: " + size);
		
		//print queue using for loop
		System.out.println("Printing Queue numbers in for loop:");
		for (Integer item: q1) {
			
            System.out.println(item);
        }
		
		//Exception handling
		try
		{
			//declaring an Iterator
			
	        Iterator<Integer> itr = q1.iterator();
	        //now try deleting an element in the front
	        q1.remove();
	        while (itr.hasNext())
	        {
	            System.out.println(itr.next());
	        }
		}
		//raise an exception while deleting an element while reading the queue 
		catch (ConcurrentModificationException ex) {
            System.out.println(ex);
        }
		finally
		{
			System.out.println("Finally block is executed!");
		}

	}

}

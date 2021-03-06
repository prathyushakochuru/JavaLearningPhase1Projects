package CollectionsOp;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Arrays;


//Author: Prathyusha Kochuru
//Date: 02/08/2021

//Priority Queue operations

public class PriorityQueueOp {

	public static void main(String[] args) {
		// create priority queue
	      PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
	      //add values to the priority queue
	      prq.add(8);  
	      prq.add(9);
	      prq.add(6);
	      prq.add(23);
	      prq.add(12);
	      prq.add(8);  
	      prq.add(89);
	      prq.add(1);
	      
          //read priority queue
	      System.out.println("Priority queue prq: "+ prq);
	      
	      System.out.println("Peak of the priority queue is : "+ prq.peek());
	      
	      //insert an element
	      prq.offer(2);
	      // read priority queue after insertion
	      System.out.println("Priority queue prq after insert: "+ prq);
	      
	      //delete an element
	      prq.remove(6);
	      //read priority queue after deletion
	      System.out.println("Priority queue prq after delete: "+ prq);
	      
	    //delete an element using poll() - which sorts while deleting and removed head
	      prq.poll();
	      //read priority queue after deletion
	      System.out.println("Priority queue prq after poll: "+ prq);
	      
	      //size of priority queue
	      System.out.println("Size of the queue prq: "+ prq.size());
	      
	      //converting a priority queue to array
	      Integer[] arr = prq.toArray(new Integer[prq.size()]);
	      
	      //array before sorting
	      System.out.println("Converted to Array: " + Arrays.asList(arr));
	      //sorting an array
	      Arrays.sort(arr);
	      System.out.println("Converted to Array: " + Arrays.asList(arr));

	}

}

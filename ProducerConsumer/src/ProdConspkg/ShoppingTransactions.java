package ProdConspkg;
import java.util.LinkedList;

public class ShoppingTransactions {
	
	private LinkedList<String> shoplist;
	private int lssize;
	public ShoppingTransactions(int lssize) {
		super();
		this.shoplist = new LinkedList<>();
		this.lssize = lssize;
	}
	
	//put method that will be used by Producer which is synchronized with Consumer when gets
	public synchronized void putvalue(String item) throws InterruptedException
	{
		while(shoplist.size() >= lssize)
		{ //wait here lets synchronized threads to access the method one at a time
          wait();
		}
		//add the item to the list
		shoplist.add(item);
		//wakes up the waiting threads
		notify();	
	}
	
	//get method that will be used by Consumer which is synchronized with Producer when puts
	public synchronized String getvalue() throws InterruptedException
	{
		while(shoplist.size() == 0)
		{
			//wait here lets synchronized threads to access the method one at a time
	          wait();
		}
		//retrieves the head of list and deletes it
		String getItem = shoplist.poll();
		notifyAll();
		return getItem;
	}
	
}

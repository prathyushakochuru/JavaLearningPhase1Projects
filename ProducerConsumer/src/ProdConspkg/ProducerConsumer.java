package ProdConspkg;

public class ProducerConsumer {

	public static void main(String[] args) {
		//Products 
		String products[] = {"Phone", "USB", "TV", "Microwave", "AirFryer"};
		//passing the product array length to the shopping transactions 
		ShoppingTransactions shop = new ShoppingTransactions(products.length);
		
		//Thread class - Producer
		Thread prodthread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					int i = 0;
					//passing products[] array items to the producer putvalue()
			        while (i < products.length) {
			            shop.putvalue(products[i]);
			            System.out.println("Producer sold " + products[i]);
			            i++;
			            Thread.sleep(500);
			            
			        	}
			
					}
				catch(InterruptedException ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		});
		
		//Thread class - Consumer
		Thread consthread = new Thread(new Runnable() {
		
			@Override
			public void run()
			{
				try {
					//get produced item from getvalue() - shoppingTransactions
					while(true)
					{
					String strget = shop.getvalue();
					System.out.println("Consumer received " + strget);
					Thread.sleep(500);
					}
				}
				catch(InterruptedException ex)
				{
					System.out.println(ex.getMessage());
			    }
			}
		});
		
		//start bothe threads - Prod-Consumer
		prodthread.start();
		consthread.start();
		
		try {
			//join() both the threads to complete the process
			prodthread.join();
			consthread.join();
		
        }
		catch(InterruptedException ex)
		{
			System.out.println(ex.getMessage());
	    }
		
		

	}

}

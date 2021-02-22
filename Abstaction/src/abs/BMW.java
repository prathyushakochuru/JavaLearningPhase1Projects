package abs;

//Grabs Vehical methods and implement
public class BMW extends Vehical{
	
	@Override
	void drive()
	{
		System.out.println("Drive by BMW - All wheel drive & Automatic");
	}

	@Override
	void entertainment() {
		System.out.println("Entertainment BMW");
		
	}

	@Override
	void seating() {
		System.out.println("BMW - no. of seats - 8");
		
	}

}

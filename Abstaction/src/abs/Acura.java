package abs;


//Grabs Vehical methods and implement
public class Acura extends Vehical{
	
	@Override
	void drive()
	{
		System.out.println("Drive by Acura - All wheel drive");
	}

	@Override
	void entertainment() {
		System.out.println("Entertainment Acura");
		
	}

	@Override
	void seating() {
		System.out.println("Acura - no. of seats - 7");
		
	}

}

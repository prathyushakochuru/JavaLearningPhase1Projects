package inherpkg;

public class Airplane {

	
	public String look = "wings";
	
	
	public void fly()
	{
		System.out.println("Airplane flies in the air");
	}
}

 class BoingAE extends Airplane
{
	public String name = "BoingAE";
	public int modelnum = 10029;
}

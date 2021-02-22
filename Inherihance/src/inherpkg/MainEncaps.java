//Author: Prathyusha Kochuru
//Date: 02/22/2021

package inherpkg;

public class MainEncaps {

	public static void main(String[] args) {
		
		BoingAE b1 = new BoingAE();
		
		System.out.println("Name: " + b1.name);
		System.out.println(b1.name + " has " + b1.look);
		System.out.println("Model number: " + b1.modelnum);
		b1.fly();
		
		

	}

}

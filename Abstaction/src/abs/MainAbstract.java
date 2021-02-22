
//Author: Prathyusha Kochuru
//Date: 02/22/2021
//Abstraction Implementation

package abs;

public class MainAbstract {

	public static void main(String[] args) {
		
			//call Acura class
			Vehical ac = new Acura();
			
			ac.display();
			ac.drive();
			ac.entertainment();
			ac.seating();
			
			//call BMW class
			Vehical bmw = new BMW();
			
			bmw.display();
			bmw.drive();
			bmw.entertainment();
			bmw.seating();


	}

}

//Author: Prathyusha Kochuru
//Date: 02/22/2021
//Interface Implementation

package interfacepkg;

public class MainInterface {

	public static void main(String[] args) {
		
		iPhone ph = new iPhone();
		
		ph.type();
		ph.usage();
		ph.visibilty();
		
		System.out.println("iPhone's disply has " + ph.screen);


	}

}

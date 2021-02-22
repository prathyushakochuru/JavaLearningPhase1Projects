//Author: Prathyusha Kochuru
//Date: 02/22/2021
//Encapsulation Implementation

package encapspkg;

public class Mainpage {

	public static void main(String[] args) {
		Userdetails user = new Userdetails();
		
		user.setName("Prathyusha Kochuru");
		user.setUsername("prathyushakoch");
		user.setPwd("pwd123");
		user.setPhno("+1879879879989");
		
		System.out.println("Full name: " +  user.getName());
		System.out.println("Username: " +  user.getUsername());
		System.out.println("Protected Password: " +  user.getPwd());
		System.out.println("Mobile number: " +  user.getPhno());

	}

}

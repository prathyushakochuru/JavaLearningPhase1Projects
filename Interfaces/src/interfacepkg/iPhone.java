package interfacepkg;

public class iPhone implements Electronics, mobile {

	

	@Override
	public void type() {
		System.out.println("iPhone-Its a new generation mobile");
		
	}

	@Override
	public void usage() {
		System.out.println("iPhone is used to communicate");
		
	}
	
	@Override
	public void visibilty() {
		System.out.println("iPhone has touch screen");
		
	}

}

//Author: Prathyusha Kochuru
//Date: 02/22/2021

package polypkg;

public class MainPoly {

	public static void main(String[] args) {
		
		CalculateArea cal = new CalculateArea();
		System.out.println("Area of a Rectangle 5X7 is " + cal.area(5,7));
		System.out.println("Area of a Square with side 5 is " + cal.area(5));

	}

}

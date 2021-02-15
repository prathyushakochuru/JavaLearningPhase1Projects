/* ITIN Validation Regex */
/* Author: Prathyusha Kochuru
 * Date: 02/15/2021 */

package validation;
import java.util.*;
import java.util.Scanner;

public class ITINValidation {

	public static void main(String[] args) {
		
		String strITIN = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your ITIN number: ");
		strITIN = scanner.next();
		
		try {
			if(strITIN.length() == 11 && strITIN.matches("9[0-9]{2}-[0-9]{2}-[0-9]{4}") )
				{
					System.out.println("Your ITIN is valid!");
				}
			
			else
				{
					System.out.println("Your ITIN is not valid!");
				}
			}
		catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			

	}

}

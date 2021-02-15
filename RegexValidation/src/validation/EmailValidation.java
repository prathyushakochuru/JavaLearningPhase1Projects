/* Email ID Validation Regex */
/* Author: Prathyusha Kochuru
 * Date: 02/15/2021 */

package validation;
import java.util.*;
import java.util.Scanner;


public class EmailValidation {

	public static void main(String[] args) {
		String strEmail = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your email address: ");
		strEmail = scanner.next();
		
		if(strEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
		{
			System.out.println(strEmail + " is valid!");
		}
		else
		{
			System.out.println(strEmail + " is not valid!");
		}

	}

}

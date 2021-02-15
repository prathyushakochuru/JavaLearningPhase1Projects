/* ID Validation Regex */
/* Author: Prathyusha Kochuru
 * Date: 02/15/2021 */

package validation;
import java.util.*;
import java.util.Scanner;


public class IDvalidation {

	public static void main(String[] args) {
		
		
		String strnum = "";
		int op;
		boolean result;
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("Select 1-US Mobile 2-SSN 3-ITIN 4-PassportNum :");
		op = scanner.nextInt();
		
		//error handling
		try {
			//allow user to select the option to validate - switch-case
		switch(op)
		{
		case 1:
			System.out.println("Please enter your US mobile number: ");
			strnum = scanner.next();
			result=IsNumValid(strnum);
			break;
		case 2:
			System.out.println("Please enter your SSN: ");
			strnum = scanner.next();
			result=IsSSNValid(strnum);
			break;
		case 3:
			System.out.println("Please enter your ITIN: ");
			strnum = scanner.next();
			result=IsITINValid(strnum);
			break;
		case 4:
			System.out.println("Please enter your Passport number: ");
			strnum = scanner.next();
			result=IsPasValid(strnum);
			break;
		
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	

	//Indian mobile number validation
	public static boolean IsNumValid(String strnum) {
		
		boolean b1 = false;
		
		
			if(strnum.length() == 12 && strnum.matches("\\+1[0-9]{10}") )
				{
					System.out.println("Your mobile number is valid!");
					b1 = true;
				}
			
			else
				{
					System.out.println("Your mobile number is not valid!");
					b1 = false;
				}
		
			return b1;
	}
	//SSN validation
	public static boolean IsSSNValid(String strnum) {
		
		boolean b1 = false;
		
		
			if(strnum.length() == 11 && strnum.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}") )
				{
					System.out.println("Your SSN is valid!");
					b1 = true;
				}
			
			else
				{
					System.out.println("Your SSN is not valid!");
					b1 = false;
				}
		
			return b1;
	}
	//ITIN validation
	public static boolean IsITINValid(String strnum) {
	
	boolean b1 = false;
	
	
		if(strnum.length() == 11 && strnum.matches("9[0-9]{2}-[0-9]{2}-[0-9]{4}") )
			{
				System.out.println("Your ITIN is valid!");
				b1 = true;
			}
		
		else
			{
				System.out.println("Your ITIN is not valid!");
				b1 = false;
			}
	
		return b1;
	}
	//Passport number validation
	public static boolean IsPasValid(String strnum) {
	
	boolean b1 = false;
	
	
		if(strnum.length() == 9 && strnum.matches("[A-Z]{1}[0-9]{8}") )
			{
				System.out.println("Your Passport number is valid!");
				b1 = true;
			}
		
		else
			{
				System.out.println("Your Passport number is not valid!");
				b1 = false;
			}
	
		return b1;
	}
	
}

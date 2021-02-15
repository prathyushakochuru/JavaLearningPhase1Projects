
import java.util.*;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a palindrome: ");
		str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		
		String strre = sb.toString();
		
		if(str.equals(strre))
		{
			System.out.println("It IS a palindrome");
		}
		else
		{
			System.out.println("It is NOT a palindrome");
		}
		
		

	}

}

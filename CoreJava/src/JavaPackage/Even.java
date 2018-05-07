package JavaPackage;

import java.util.Scanner;

public class Even {
	public static void main(String args[]) 
	{
		int num;
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Enetr the num");
		num = sc.nextInt();
		
		
	 if(num%2==0) 
		System.out.println("num is even");
		else
			System.out.println("num is odd");
	}
}

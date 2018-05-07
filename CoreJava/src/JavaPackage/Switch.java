package JavaPackage;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int a=2, b= 3, c;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("select the case.a..");
		String var= sc.next();
		switch(var)
		{
		case "add":
		c=a+b;
		System.out.println(+c);
		break;
		case "sub":
		c=a-b;
		System.out.println(+c);
		break;
		case "mul":
		c=a*b;
		System.out.println(+c);
		break;
		default:
		
		System.out.println("Default....");
		break;
		}
		}
}}

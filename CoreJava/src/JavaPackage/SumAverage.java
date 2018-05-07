package JavaPackage;

import java.util.Scanner;

public class SumAverage {
	public static void main(String args[])
	{
		int n = 0,sum=0,avg,i = 0;
		
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
        System.out.print("Enter no. of elements you want in array:");
        
        System.out.println("Enter all the elements:");
       
        {
            sum = sum + n;

        }
        System.out.println("Sum:"+sum);

        avg =sum / n;

        System.out.println("Average:"+avg);
		
	}
}

package CurrencyDenominations.Driver;

import java.util.Scanner;

import CurrencyDenominations.Services.CurrencyDenominations;
import CurrencyDenominations.Services.SortCurrnecyDenomination;

public class Driver {

	public static void main(String[] args) {

		//Object creation for Currency Denominations and SortCurrencyDenominations Class
		CurrencyDenominations cd = new CurrencyDenominations();
		SortCurrnecyDenomination scd = new SortCurrnecyDenomination();
		//Declaration of variables
		int n,amt;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of currency denominations");  
		//Reading the number of transactions from user  
		n=sc.nextInt();  
		//Creates an array with memory of length n 
		int[] array = new int[n];  
		System.out.println("Enter the currency denominations value");  
		for(int i=0; i<n; i++)  
		{  
			//Reading array elements from the user   
			array[i]=sc.nextInt();  
		}
		System.out.println("Enter the amount you want to pay");
		amt=sc.nextInt();
		sc.close();

		//Calling methods of Currency Denominations and SortCurrencyDenominations Class
		scd.sortCurrencyDenominations(array, 0, array.length - 1);
		System.out.println("Your payment approach in order to give min no of notes will be");
		cd.paymentApproach(array, n, amt);

	}

}

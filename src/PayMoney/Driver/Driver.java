package PayMoney.Driver;

import java.util.Scanner;

import PayMoney.Services.PayMoney;

public class Driver {

	public static void main(String[] args) {

		//Creating Object of PayMoney Class
		PayMoney pm = new PayMoney();
		//Declaration of variables
		int n,m;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of transaction array");  
		//reading the number of transactions from the that we want to enter  
		n=sc.nextInt();  
		//creates an array with the memory of length n 
		int[] array = new int[n];  
		System.out.println("Enter the values of array");  
		for(int i=0; i<n; i++)  
		{  
			//reading array elements from the user   
			array[i]=sc.nextInt();  
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		m=sc.nextInt();
		int[] arrayTarget = new int[m];    
		for(int i=0; i<m; i++)  
		{     
			System.out.println("Enter the values of target");
			arrayTarget[i]=sc.nextInt();  
			//Calling method of PayMoney Class for every target
			System.out.println(pm.isTargetReached(array, n, arrayTarget[i])+"\n");
		}
		sc.close();

	}

}

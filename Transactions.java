package com.greatlearning.lab2alg;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the transaction Array ");
		int size =scan.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the values of the array");
		for(int i =0; i<size; i++ )
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter total num of targetsthat needs to be achieved");
		
		int targetCount = scan.nextInt();
		
		System.out.println("Enter the value of the target");
		
		int targetValue= scan.nextInt();
		int sum=0;
		int flag = 0;
		for(int i =0; i<size; i++ )
		{
			 sum = sum+ arr[i];
			 
			if (sum > targetValue)
			{
				System.out.println("target achieved after" + i+1+ "transcations");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println(" Given target is not achieved ");
		}
		
	}
}

package com.sample1;

import java.util.Scanner;

public class Naddition {

		void getresult() 
		{

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int result=0;
		int n;
		int i;
		int num[]=new int[100];
		
		System.out.println("enter no.of values you want to add");
		
		n=sc.nextInt();
		
		System.out.println("eneter values");
		
		for(i=0;i<n;i++) {
			
			num[i]=sc.nextInt();
		}
	
	for(i=0;i<n;i++) {
		
		result=result+num[i];
		
		System.out.println(result);
		
	}
		sc.close();	
		}
}
		

	
	



package com.sample1;

import java.util.Scanner;

public class Menuclass {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int num1,num2,option;
		 
		 System.out.println("Enter your choice from the following menu:");
		 System.out.println("1.Addition");
		 System.out.println("2.Subtraction");
		 System.out.println("3.Multiplication");
		 System.out.println("4.Division ");
		 System.out.println("5.Exit");
		
		
		option = sc.nextInt();
		
		do
			 
		 {
		 
		 System.out.println("Enter the first number");
		 num1=sc.nextInt();
		 System.out.println("Enter the second number");
		 num2=sc.nextInt();
		 
		 
		
		 switch(option)
		 {
		 case 1:
		
			 System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		System.out.println("Do you want to continue?1.Yes 2.No");
		
		
		 break;
		 case 2:System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
		 System.out.println("Do you want to continue?1.Yes 2.No");
		 
		 
		 break;
		 case 3:System.out.println("multiplication of "+num1+" and "+num2+" is "+(num1*num2));
		 System.out.println("Do you want to continue?1.Yes 2.No");
		 break;
	   case 4:System.out.println("Dividion of "+num1+" and "+num2+" is "+(num1/num2));
	   
	   System.out.println("Do you want to continue?1.Yes 2.No");
	   break;
	   
	   case 5:break;
	   
	   default: System.out.println("Invalid choice");
	   
		 }
		 
		 
      }while(option!=6);
		 
		 sc.close();
	}
}
	
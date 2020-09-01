package com.sample2;

import java.util.Scanner;

public class Menudriven {
	
			static int result;
			static int num;
			int s=0;
			int su=0;
			int m=1;
			static int d;
			private static Scanner scan;
			
			public static void main(String[] args) throws MyownException {
				int c1 = 0;
				
				scan = new Scanner(System.in);
	
		do {
				System.out.println("Enter the number of inputs for the operations:");
				num=scan.nextInt();
				 int i1[]= new int[num];
						
				for(int i=0;i<num;i++) {
							
				System.out.println("enter value:");
							
				i1[i]=scan.nextInt();
							
				}
			
				
		   System.out.println("please selct your option from the menu");
			System.out.println("1.Addition");
			System.out.println("2.subtraction");
			System.out.println("3.division");
			System.out.println("4.multiplication");
			System.out.println("5.Expression evaluation");
				
			System.out.println("Enter choice::");
				
			int choice = scan.nextInt();
				
				switch(choice) {
						
				case 1: System.out.println("Addition of given numbers");
				
				Add1class a1= new Add1class();
				
				a1.add(i1);  // calling add method of Add1class
				
				break;
			
				case 2: System.out.println("Subtraction of given numbers");
				
				Subclass1 sub1=new Subclass1();
				sub1.sub(i1);  //calling the sub method of subclass1
				
				break;
				
				case 3: System.out.println("Division of given numbers");
				
				Div1class d = new Div1class();
				
				d.div(i1); //calling the div method of Div1class
				
				break;
				case 4: System.out.println("Multiplication of given numbers");
				
				Multiplication1 m = new Multiplication1();
				
				m.mul(i1); //calling the mul method of Multiplication1 class
				
				break;
				
				//case 5: System.out.println("enter expression");
				
				
				//break;
				default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
				
				}
				System.out.println("do you want to continue?1.yes 2.No");
			 c1=scan.nextInt();
				if(c1==2){
					System.out.println("exit");
		}
					}while(result!=9&&c1!=2);
			}
}
				

				
			
				

			




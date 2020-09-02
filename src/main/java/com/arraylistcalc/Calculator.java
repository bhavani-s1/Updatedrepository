package com.arraylistcalc;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

	static int index;

	static int result;
	
	public static void main(String[] args) {
	
		int choice;
		
		do {
			
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Exit ");
			//System.out.println("================================");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			if (choice > 0 && choice <= 4) {
		
	System.out.println("Enter the number of values you want to perform operation: ");
			
		int quantity = input.nextInt();
		
		System.out.println("Enter " + quantity + " inputs:");
		
		for (index = 0; index < quantity; index++) {
					int values = input.nextInt();
					
					list.add(values);   
				}
		

	}
			switch (choice) {

			case 1:

				Additionlist add = new Additionlist();
				add.getResult(list);
				break;
			case 2:

				Subtractlist sub = new Subtractlist();
				sub.getResult(list);
				break;
			case 3:

				Multiplylist multiply = new Multiplylist();
				multiply.getResult(list);
				break;
			case 4:

				Divisionlist division = new Divisionlist();
				division.getResult(list);
				break;

			case 5:
				System.out.println("You have pressed 5. The program has ended..!!");
				break;
			default:
				System.out.println("Wrong Choice...!!");
			
          input.close();
			}
		} while (choice != 5);
	}

			
			
			
}
	

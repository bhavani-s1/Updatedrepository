package com.arraylistcalc;

import java.util.ArrayList;

public class Multiplylist extends Calculator {
		
	void getResult(ArrayList<Integer> list) {
			
			result = 1;
			
			for (int index = 0; index < list.size(); index++) {
				result = result * list.get(index);
			}
			System.out.println("Multiplication of all numbers is " + result);
			

		}
	}
	


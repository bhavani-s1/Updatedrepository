package com.arraylistcalc;

import java.util.ArrayList;

public class Subtractlist extends Calculator {

		void getResult(ArrayList<Integer> list) {

			result = list.get(0);
			
			for (int index = 0; index < list.size()-1; index++) {
				result = result - list.get(index + 1);
			}
			System.out.println("Subtraction is : " + result);
			

		}
	}
	
	


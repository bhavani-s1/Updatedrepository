package com.sample2;

import java.util.Scanner;

public class ExampleExpression {

public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);

	        // The result of the operation
	       int result = 0;

	        // The original input
	       
	       
	        System.out.print("Enter an expression to compute: ");
	        String input = scan.nextLine();
             String[] s1 = input.split(""); //splits the expression
	        
	        //System.out.println(s1.length);
	      for(int i=0;i<s1.length;i++) {
	        	
	        	//System.out.println(s1[i]); 
	        
	        System.out.println(s1[1]);
	      }
	        //System.out.println(s1[1].charAt(0));
	
	

	        // Determine the operator
	        switch (s1[1].charAt(0)) {
	            case '+':
	                result = Integer.parseInt(s1[0])
	                        + Integer.parseInt(s1[2]);
	                break;
	            case '-':
	                result = Integer.parseInt(s1[0])
	                        - Integer.parseInt(s1[2]);
	                break;
	            case '*':
	                result = Integer.parseInt(s1[0])
	                        * Integer.parseInt(s1[2]);
	                break;
	            case '/':
	                result = Integer.parseInt(s1[0])
	                        / Integer.parseInt(s1[2]);
	        }

	        // Display result
	        System.out.println(s1[0] + ' ' + s1[1] + ' '
	                + s1[2] + " = " + result);
	        scan.close();
	    }
	
	

	}



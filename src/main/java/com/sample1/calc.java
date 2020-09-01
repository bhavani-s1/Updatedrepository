package com.sample1;

import java.util.Scanner;

public class calc extends Addition{
		
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
			
		int num;
		int num1;
			
		String selection;
			
			System.out.println("Enter an integer: ");
			
		     num = s.nextInt();
		     
		    System.out.println("Enter an integer: ");
		     
		    num1 = s.nextInt();
		     
		    System.out.println("Enter operation:+/-/*/");
		    
		    selection=s.next();
		    
		    Addition add= new Addition();
		    
		   Subtraction sub= new Subtraction();
		   
		    Multiplication mul=  new Multiplication();
		    
		  Division div=  new Division();
		    
		   switch(selection)
		    {
		    	
	case "+" : System.out.println("addition of given numbers"+ add.result(num,num1));
		   	
   break;
		    	
	case "-" :System.out.println("substraction of given numbers"+ sub.result(num,num1)); 
    break;
		    	
	case "*" : System.out.println("Multiplication of given numbers"+ mul.result(num,num1));
	break;
		    	
   case "/" : System.out.println("Division of given numbers"+ div.result(num,num1));
	break;
		    	
  default: System.out.println("invalid output");
		    	
		   }
		    
		  s.close();
	        
}
}

		

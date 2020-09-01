package com.sample;

public class Calculator {
	
	
        int add(int a, int b) {
        		
        		return(a+b);
        	}
        	
        	int sub(int x, int y) {
        		
        		return(x-y);
        		
        	}
        	
        	public class calc extends Calculator{
        		
        		int mul(int i, int j)
        		{
        			
        			return(i*j);
        			
        		}
        	
        		public void main(String[] args) {
        			
        	        calc c1= new calc();
        	        
        	        System.out.println(c1.add(10,20));
        	        System.out.println(c1.mul(10,20));
        	        
	}

}

}
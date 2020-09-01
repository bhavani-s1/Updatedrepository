package com.sample2;

public class Example {

	public void check() {
			
			//handling Arthemtic exception
		int i=10;
		
		
	try{
		int x=i/0;
		 
		
			System.out.println("exception handled");
			System.out.println(x);
	}
				
		catch(Exception e) {
			System.out.println(e);
			
	}
		
	//handling NumberFormatException
		
		/*String s="Hello";
		int num=Integer.parseInt(s);// typecasting string to number
		
		try {
			
			System.out.println("exception occured");
			System.out.println(num);
			
			
		}
	catch(NumberFormatException e) 
		{
		System.out.println(e);
		}
		
	}*/
		
		//Handling ArrayIndexOutofBounds 
	
		
	int a[]= {1,2,3,4};
	
	try {
		
		System.out.println(a[4]);
		
		
	}
		
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);	
	}
finally {
	System.out.println("final statement will execute irrespective of the exception");
}
	}
	public static void main(String[] args) {
		
		Example e1= new Example();
		
			e1.check();
		}

	}



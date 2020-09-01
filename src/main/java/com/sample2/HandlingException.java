

package com.sample2;
	import java.util.*;
	
	public class HandlingException {
		public static void main(String[] args) throws MyownException {
			Scanner sc = new Scanner(System.in);
			int num1,num2,contop,option,nextch;

			option=0;
			contop=0;
			nextch=0;
			
		    do
		    {
		 
			System.out.println("Enter your choice from the following menu:");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division ");
			System.out.println("5.Exit");
			
			nextch= Integer.parseInt(sc.next());
	       
			if (nextch <5)	
		    {
			System.out.println("Enter the first number");
			num1=sc.nextInt();
			System.out.println("Enter the second number");
			num2=sc.nextInt();
			
			if (nextch!=0)
			option=nextch;
			
			switch(option)
			{
			case 1:
			System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
			System.out.println("Do you want to continue?1.Yes 2.No");
			contop = sc.nextInt();
			break;
			case 2:
			System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
			System.out.println("Do you want to continue?1.Yes 2.No");
			contop = sc.nextInt();
			break;
			case 3:
			System.out.println("multiplication of "+num1+" and "+num2+" is "+(num1*num2));
			System.out.println("Do you want to continue?1.Yes 2.No");
			contop = sc.nextInt();
			break;
			case 4:
				try {
					
					if(num2==0)
						throw new MyownException("this is not possible");
				System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
				
				
				}
				
				catch(MyownException e)
				{
					System.out.println(e);
					
				}
			System.out.println("Do you want to continue?1.Yes 2.No");
			contop = sc.nextInt();
			break;
			case 5:
		    System.out.println("This is invalid input");
			break;
			default: System.out.println("Invalid choice");
			}
			}
			else
			{
			System.out.println("you have entered 5 ...The program terminated");
			}
			}while(contop !=2 && nextch!=5 );

	       if(contop==2) {
	    	   
	    	   System.out.println("you have entered option for not to continue");
	       }
			sc.close();
			}
	}

	


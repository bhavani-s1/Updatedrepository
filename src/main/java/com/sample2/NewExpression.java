package com.sample2;

import java.util.Scanner;

    

public class NewExpression {
	
		public static void main(String[] args) {

			NewExpression m = new NewExpression();

		    m.eval();

		    }

		public void eval()
		{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression to be evaluated");

		String exp = sc.next();

		String[] op1 = exp.split("[\\+\\-\\*\\/]");
		String[] op2 = exp.split("\\d+");

		int result = 0;

		for (int i= 0; i < op2.length; i++)
		{
		int number = Integer.parseInt(op1[i]);

		switch(op2[i])
		{
		case "+":
		result = result + number;
		break;
		case "-":
		result = result - number;
		break;
		case "*":
		result = result * number;
		break;
		case "/":
		result = result / number;
		break;
		default: result = result + number;
		}
		}
		System.out.println("Result of expression evaluation = " + result);

		sc.close();
		}
		}

	
	
	


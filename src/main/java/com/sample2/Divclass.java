package com.sample2;

public class Divclass extends Classmain {

	public void div(int[] i1) throws MyownException {
		 d=i1[0];
		
		for(int i=1;i<num;i++)
		{
			if(i1[i]==0)
				throw new MyownException("this is not possible");
		d= d/i1[i];
		
		}
		System.out.println(d);

		}
		}

	


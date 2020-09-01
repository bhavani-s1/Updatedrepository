package com.sample2;


	public class Div1class extends Menudriven {

		public void div(int[] i1) throws MyownException {
			 d=i1[0];
			
			for(int i=1;i<num;i++)
			{
				//try {

				if(i1[i]==0) {
				
					d= d/i1[i];
					throw new MyownException("Division by 0 is not possible");
			
				
				}
			
		//	catch(MyownException e) {
				//System.out.println(e);
			//}
				
			}
			System.out.println(d);

			}
	}
			



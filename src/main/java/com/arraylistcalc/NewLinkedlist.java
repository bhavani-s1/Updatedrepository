package com.arraylistcalc;

import java.util.LinkedList;

public class NewLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> l1= new LinkedList<String>();
		
               l1.add("Java");
               l1.add("linkedlist");
               l1.add("class");
               
               System.out.println(l1);
               
               l1.addFirst("bhavani");
               l1.addLast("Reddy");
               
               System.out.println(l1);
               //get
               System.out.println(l1.get(0));
               
               //set
               
               System.out.println(l1.set(4," manvit"));
	}

}

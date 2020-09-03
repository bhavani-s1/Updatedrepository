package com.sample1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashsample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		//to store values
		
		hm.put(1, "John");
		hm.put(2, "johny");
		hm.put(3, "selenium");
		hm.put(4,"QTP");
		//to fetch values from hashmap
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		//to get all the values we need to create entryset
		
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
			
		}

		hm.remove(3);
		System.out.println(hm);
		

	}

}

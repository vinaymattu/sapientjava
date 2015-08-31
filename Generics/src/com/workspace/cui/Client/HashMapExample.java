package com.workspace.cui.Client;

import java.util.HashMap;

class data1 {
	int value;

	public data1(int value) {
		this.value = value;
	}

	public void getValue() {
		System.out.println(value);
	}
}

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer,data1> result=new HashMap<Integer,data1>();
		
		result.put(3, new data1(12));
		result.put(5, new data1(23));
		result.put(3, new data1(34));
		result.put(8, new data1(56));


		for(Integer s:result.keySet())
		{
			System.out.println(s+ " "+result.get(s));
		}
		
	
	}



}

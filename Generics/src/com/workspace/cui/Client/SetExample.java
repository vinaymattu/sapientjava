package com.workspace.cui.Client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	Set<String> s=new HashSet<String>();
			
	
	s.add("A");
	s.add("F");
	s.add("A");
	s.add("Z");
	s.add("V");
	
	
	
	Iterator<String> it=s.iterator();
	String name;
	while(it.hasNext())
	{
		name=it.next();
		System.out.println(name);
	}
	}
	
	
	
	

}

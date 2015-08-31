package com.workspace.cui.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Listexample {

	public static void main(String[] args) {
		
	List<String> l=new ArrayList<String>();
	
	l.add("A");
	l.add("B");
	l.add("F");
	l.add("Z");
	l.add("O");
	
	
	
	for(int counter=0;counter<l.size();counter++)
	{
		System.out.println(l.get(counter));
	}
	
	
	Iterator<String> it=l.iterator();
	
	String name;
	
	while(it.hasNext())
	{
		name=it.next();
		System.out.println(name);
	}

	}

}

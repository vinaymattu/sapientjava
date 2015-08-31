package com.workspace.cui.Client;

class data<T>
{
	T value;
	
	

	
	public void getValue() {
		System.out.println(value);
	}

	
	public void setValue(T value) {
		this.value = value;
	}
	
}
public class MainApp {

	public static void main(String[] args) {
		
		data<Integer> d=new data<Integer>();
		
		d.setValue(new Integer(45));
		
		d.getValue();
	

	}

}

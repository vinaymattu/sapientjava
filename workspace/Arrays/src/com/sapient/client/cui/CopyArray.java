package com.sapient.client.cui;

public class CopyArray {

	public static void main(String[] args) {
	
		int[] scr;
		scr=new int[20];
		scr[1]=3;
		
		int[] Des=new int[30];
		
	System.arraycopy(scr, 0, Des, 0, 20);
	
	for(int data:Des)
	{
		System.out.println(data);
	}

}
}


package com.sapient.client.cui;

public class MultiArray {

	public static void main(String[] args) {
		System.out.println("begin");
		
		int[][][] num;
		
		num=new int[5][3][2];
		
		num[1][1][1]=5;
		num[2][1][1]=7;
		
		
		for(int data[][]:num)
		{
			for(int n[]:data)
			{
				for(int i:n)
				{
					System.out.print(i+" ");
				}
			}
		}
	}

}

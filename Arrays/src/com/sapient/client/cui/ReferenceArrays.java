package com.sapient.client.cui;



class point
{
	int x,y;
public point()
{
	
}
   public point(int a,int b)
	{
		x=a;
		y=b;
	}
	
   void display()
	{
		System.out.println(x+" "+y);
	}
}
public class ReferenceArrays {
	
public static void main(String args [])
{
	
	point[] p1;
	p1=new point[10];
	
	for(int i=0;i<10;i++)
	{
	    p1[i]=new point(i,i+1);	
	}
	
	for(int i=0;i<10;i++)
	{
		p1[i].display();
	}
}
	

}

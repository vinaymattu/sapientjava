package com.sapient.client.cui;
class process
{
	 int[] create()
	{
		int[] num;
		
		num=new int[10];
		
		num[3]=6;
		num[7]=9;
		
	return num;	
	}
	 
	 
	 void display(int[] src)
	 {
		 for(int data:src)
		 {
			 System.out.println(data);
		 }
	 }
	 
}




public class MainApp {

	public static void main(String[] args) {
	
		System.out.println("begin");
		int num[];   //stack
        num=new int[10];
        int ref[];
        ref=num;
        ref[4]=5;
        
   /*  for(int counter=0;counter<num.length;counter++)
     {
    	 System.out.println(num[counter]);
     }*/
        process p= new process();
        
        int[] result=p.create();
        p.display(result);
    
	}

}

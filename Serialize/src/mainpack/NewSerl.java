package mainpack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

 class Student implements Serializable
{
	String name;
	int age;
	
	public  Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	
}
public class NewSerl {

	public static void main(String[] args) {
		
		
		Student s=new Student("vinay",23);
		
		
		try {
			FileOutputStream fout=new FileOutputStream("file.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
	
		

	}

}

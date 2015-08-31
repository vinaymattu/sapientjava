package mainpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Sample implements Serializable{
	String s;
	int i;
	double d;
	public Sample(String s,int i,double d)
	{
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString(){
		return "s:"+s+"d:"+d+"i"+i;
	}
}

public class Project8 {

	public static void main(String[] args) {
	
	
		
		
			try{
						Sample object1=new Sample("Hi",-7,2.7);
						System.out.println("Object1: "+object1);
						FileOutputStream fos=new FileOutputStream("store");
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(object1);
						oos.flush();oos.close();
					}
					catch(IOException e){
						System.out.println("Exception:"+e);
						System.exit(0);
					}
		
			try{
						Sample object2;
						FileInputStream fis=new FileInputStream("store");
						ObjectInputStream ois=new ObjectInputStream(fis);
						object2=(Sample)ois.readObject();
						ois.close();
						System.out.println("object2: "+object2);
						
					}
					catch(Exception e){
						System.out.println("Exception:"+e);
						System.exit(0);
					}


	}

}

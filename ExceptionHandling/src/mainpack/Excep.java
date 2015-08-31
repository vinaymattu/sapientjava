package mainpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		
		
		
		try(
			 FileInputStream in=new FileInputStream("sapin.txt");
			 FileOutputStream out=new FileOutputStream("sapout.txt")
			 )
	
			 {	
		int c;
		while((c=in.read())!= -1)
		{
			out.write(c);
		}
			 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	

}

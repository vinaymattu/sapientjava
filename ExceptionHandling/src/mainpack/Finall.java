package mainpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finall {

	public static void main(String[] args) {
	
		FileInputStream in=null;
		FileOutputStream out=null;
		
		
		
		
		try
		{
			int c;
			try {
				in=new FileInputStream("sapin.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out=new FileOutputStream("sapout.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			while((c=in.read())!= -1)
			{
				out.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} finally
	{
		if(in!=null)
		{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(out!=null)
		{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

}

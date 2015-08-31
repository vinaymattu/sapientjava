package mainpack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Prac5 {
	
	public static void main(String[] args) throws IOException
	{
		String source="now is the time for all good men\n"
				+"to come to the aid of their country\n"
				+" and pay their due taxes.";
		
		byte buf[]=source.getBytes();
		
		OutputStream f0=new FileOutputStream("file1.txt");
		
		for(int i=0;i<buf.length;i+=2)
		{
			f0.write(buf[i]);
		}
		f0.close();
		OutputStream f1=new FileOutputStream("file2.txt");
		f1.write(buf);
		f1.close();
		
		
		OutputStream f2=new FileOutputStream("file3.txt");
		f2.write(buf,buf.length-buf.length/4,buf.length/4);
		f2.close();
	}

}

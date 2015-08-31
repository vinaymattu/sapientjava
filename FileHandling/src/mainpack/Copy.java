package mainpack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		
try
{
	FileReader input=new FileReader(args[0]);
	try
	{
		FileWriter output=new FileWriter(args[1]);
		try
		{
			char[] buffer =new char[128];
			int charsRead;
			charsRead=input.read(buffer);
		while(charsRead!=-1)
		{
		   	output.write(buffer, 0, charsRead);
		   	charsRead=input.read(buffer);
		}
		
		}finally
		{
			output.close();
		}
	}finally
	{
		input.close();
	}
}catch(IOException e)
{
	e.printStackTrace();
}
	}
}

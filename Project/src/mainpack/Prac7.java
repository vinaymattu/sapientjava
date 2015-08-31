package mainpack;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac7 {

	public static int words=0,lines=0,chars=0;
	public static void wc(InputStreamReader isr) throws IOException {
		int c=0;
		boolean lastWhite=true;
		String WhiteSpace="\t\n\r";
		
		while((c=isr.read())!=-1)
		{
			chars++;
			if(c=='\n')
			{
				lines++;
			}
			int index=WhiteSpace.indexOf(c);
			
			if(index==-1)
			{
				if(lastWhite==true)
				{
					++words;
				}
				lastWhite=false;
			}
			else
			{
				lastWhite=true;
			}
		}
		if(chars !=0)
		{
			++lines;
		}
			
             System.out.println(lines+" "+chars);
	}
	
	public static void main(String args[])
	{
		
		FileReader fr;
		
		try
		{
			if(args.length==0)
			{
				wc(new InputStreamReader(System.in));
			}
			else
			{
				for(int i=0;i<args.length;i++)
				{
					fr=new FileReader(args[i]);
					wc(fr);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

package mainpack;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;


class base
{
        public void test() throws SQLException,IOException
        {
        	System.out.println("base");
        }
}


class derived extends base
{
	public void test() throws EOFException
	{
		System.out.println("derived");
	}
}



public class OverrideCase {

	public static void main(String[] args) {
		base b=new derived();
		
		try {
			b.test();
		} catch (SQLException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
              System.out.println("End");
	}

}

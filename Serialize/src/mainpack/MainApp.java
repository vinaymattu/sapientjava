package mainpack;

import java.io.Serializable;


class Address implements Serializable
{
	private static final long serialVersionUID=2L;   //maintain version of the class
	
	String street;
	String country;
	
	public void setStreet(String street)
	{
		this.street=street;
	}
	
	public void setCountry(String country)
	{
		this.country=country;	}
	
	public String getStreet()
	{
		return this.street;
	}
	
	public String getCountry()
	{
		return this.country;
	}


	@Override
	public String toString() {
		
	return new StringBuffer("Street: ")
	.append(this.street)
	.append("country : ")
	.append(this.country).toString();
	}
	
	
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

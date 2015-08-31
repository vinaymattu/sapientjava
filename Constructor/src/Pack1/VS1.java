package Pack1;

public class VS1 {

	private int i=1;
	
	public void firstmethod()
	{
		int i=4,j=5;
		
		this.i=i+j;
		secondmethod(7);
	}
	
	public void secondmethod(int i)
	{
		int j=8;
		this.i=i+j;
	}
}

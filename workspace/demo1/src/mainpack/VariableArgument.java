package mainpack;

class stat
{
	public float average(int ...num)
	{
		float sum=0;
		
		for(int data:num)
		{
			sum=sum+data;
		}
		
		return sum/num.length;
	}
}
public class VariableArgument {
	
	public static void main(String args[])
	{
		stat t=new stat();
		float result=t.average(1,2,3,4,5,6,7,8);
		
		System.out.println(result);
	}

}

package mainpack;

enum apple
{
	jonathon(10),goldendel(9),reddel(12),winesap(15),cortland(8);
	private int price;
	apple(int p)
	{
		price=p;
	}
	int getprice()
	{
		return price;
	}
}

public class Enumerator {
public static void main(String args [])
{
apple ap;
System.out.println("winesap cost "+apple.winesap.getprice()+" cents.\n");

System.out.println("all prices");

for(apple a:apple.values())
{
	System.out.println(a+" costs "+a.getprice()+" cents.");
}
}
}


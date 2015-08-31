package mainpack;


interface Test{
	public void Testing(int value);
}
class Execution{
	public void call(Test test,int value){
		test.Testing(value);
	}
}
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution exec=new Execution();
		exec.call((value)->{System.out.println("testing"+value);},9);
		exec.call((value)->{System.out.println("testing1"+value);},8);
		exec.call((value)->{System.out.println("testing2"+value);},7);
	}

}

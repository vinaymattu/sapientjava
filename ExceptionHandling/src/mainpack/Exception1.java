package mainpack;

class IllegalageException extends Exception {

	
	public String getMessage() {
	
		System.out.println("you need to be 18 to vote");
		return super.getMessage();
	}

}

class vote {

	public void register(int age) throws IllegalageException {
		if (age < 18) {
			throw new IllegalageException();
		}

		System.out.println("you are eligible for the register");
	}
}

public class Exception1 {

	public static void main(String[] args) {

		vote v = new vote();
		try {
			v.register(14);
		} catch (IllegalageException e) {

			e.printStackTrace();
		}
		System.out.println("End");
	}

}

package mainpack;

class data {
	int firstNumber, secondNumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public boolean equals(Object obj) {

		data d = new data();
		d = (data) obj;

		if (obj == this) {
			return true;
		}

		if (!(obj instanceof data) && obj == null) {
			return false;
		}

		if (d.getFirstNumber() == this.getFirstNumber()&& d.getSecondNumber() == this.getSecondNumber()) {
			return true;
		} else {
			return false;
		}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
	}
	
	

}

public class Prac {

	public static void main(String[] args) {

		data d1 = new data();
		data d2 = new data();

		d1.setFirstNumber(2);
		d1.setSecondNumber(4);
		d2.setFirstNumber(2);
		d2.setSecondNumber(4);

		System.out.println(d1.equals(d2));
	}

}

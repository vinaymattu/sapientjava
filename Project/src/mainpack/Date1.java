package mainpack;

class Mydate {
	int day, month, year;

	public Mydate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Mydate addDays(int Value) {

		Mydate newdate = new Mydate(0, 0, 0);
		newdate.day = this.day + Value;
		newdate.month = this.month;
		newdate.year = this.year;

		return newdate;
	}

	@Override
	public String toString() {
		return day + " " + month + " " + year;
	}

}

public class Date1 {

	public static void main(String[] args) {

		Mydate my_birth = new Mydate(22, 7, 1964);

		Mydate the_next_week = my_birth.addDays(7);

		System.out.println(the_next_week);
		System.out.println(my_birth);
	}

}

package mainpack;

abstract class employee {
	public abstract void netsalary();

}

class intern extends employee {
	public void netsalary() {
		System.out.println("intern salary");
	}
}

class confirmed_employee extends employee {
	public void netsalary() {
		System.out.println("confirmed employee salary");
	}

	public void transport() {
		System.out.println("transport for confirmed employees");
	}
}

class finance {
	public void processsalary(employee e) {
		e.netsalary();
		if (e instanceof confirmed_employee) {
			confirmed_employee conf = (confirmed_employee) e;
			conf.transport();
		}
	}
}

class hr {
	public employee recruit(String empType) {
		if (empType.equals("I")) {
			return new intern();
		} else if (empType.equals("C"))

		{
			return new confirmed_employee();
		}

		return null;

	}
}

public class MainApp {
	public static void main(String args[]) {
		hr h = new hr();
		finance f = new finance();
		employee emp = h.recruit("I");
		if (emp != null) {
			f.processsalary(emp);
		}

		emp = h.recruit("C");
		if (emp != null) {
			f.processsalary(emp);
		}
	}
}

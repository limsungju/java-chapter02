package customer;

import chapter02.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		// protected 는 다른 패키지에서 접근이 안된다.
		// c.name = "둘리";
		c.setAge(10);
	}

}

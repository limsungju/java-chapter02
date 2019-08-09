package chapter02;


public class CustomerApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		// protected 는 같은 패키지, 상속관계에서 접근 가능
		c.name = "둘리";
		
		// private 는 외부에서 접근이 불가능
		// c.age = 10;
		c.setAge(10);
		
	}

}

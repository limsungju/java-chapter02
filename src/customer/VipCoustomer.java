package customer;

import chapter02.Customer;

public class VipCoustomer extends Customer {
	public void showInfo() {
		// protected 는 같은 패키지 뿐만 아니라
		// 자식 클래스에서도  접근이 가능하다.
		System.out.println(name);
	}
}

package exception;

public class MyClass {
	public void dangerMethod() throws MyException {
		
		System.out.println("normal state1");
		
		// 예외 상황 발생
		boolean isDanger = true;
		if(isDanger) {
			throw new MyException("MyException Occurs");
		}
		
		System.out.println("normal state1");
	}
}

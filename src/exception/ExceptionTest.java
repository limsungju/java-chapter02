package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			System.out.println("some codes...1");
			
			int k = 100000 / a;
			System.out.println("some codes...2");
			System.out.println("some codes...3");
		} catch(ArithmeticException ex) {
			// 1. 로그 남기기(파일)
			System.out.println("error:" + ex);
			
			// 2. 사과하기
			System.out.println("죄송합니다. 예기치...");
			
			// 3. 정상 종료
			return;
			
			// 4. 최소한 이거라도 하세요...
			//ex.printStackTrace(); // 메소드가 호출되면서 쌓인 스택의 상태를 보여준다.
		} finally {
			System.out.println("자원정리");
		}
	}
}

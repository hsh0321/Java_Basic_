package Technic;

public class ExceptionTest3 {
	public static void main(String[] args) throws MyException, ArithmeticException, Exception {
		MyException a = new MyException("이름을 입력 안함");
		
		try {
			throw a;
		}catch(MyException e) {
			e.printStackTrace(); // 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력한다.
			System.out.println(e.getMessage());
		}
		
		System.out.println("정상종료");
	}
}

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
	
}

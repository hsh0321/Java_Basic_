package Technic;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("main 프로그램 시작");
		a();
		System.out.println("프로그램 정상종료");
	}
	
	public static void a() {
		System.out.println("a 시작");
		b();
		System.out.println("a 끝");
	}
	
	public static void b() {
		System.out.println("b 시작");
		System.out.println("b 끝");
	}
}

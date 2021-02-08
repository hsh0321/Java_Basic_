package Java_Thoery;

/*
 * 제어자 modifier - private, (default) , protected, public, abstract, final, static
 * final 불변의 : 변수 - 상수
 * 				메소드 - 오버라이딩 금지
 * 				클래스 - 상속 금지
 * */

public class Variable_modifier {
	int b = 3;
	final private int a = 3;
	
	public static void main(String[] args) {
		final int k = 1;
	}
}

abstract class A{	// abstract 클래스 : abstract 메소드를 보유할 수 있다.
	abstract void a(); // abstract 메서드 : 껍데기만 있는 메소드
}

class B{
	// 전역 변수 : 클래스 안쪽 && 메서드 밖에 선언한 변수
	int a; // 전역변수, 인스턴스 변수
			// 클래스 안쪽 && 인스턴스 변수
			// 사용가능 시점 : 객체 생성시 마다 변수가 생성된다.
			// 메모리에서 제거 : 참조변수가 없어지면, GC 메모리를 반환, 시점은 알 수 없음
	static int b; // 전역변수, static 변수, Class Area
			// 사용가능 시점 : 클래스의 정보가 메모리에 올라간 시점~
			// 메모리에서 제거 : 프로그램 종료시까지 사용됨
	int c;
	int d;
	void pp() {
		int i; // 지역변수
		// 메소드 안쪽에 선언한 변수
		// 사용가능 시점 : 선언문이 실행된 이후 ~ 선언문이 포함된 } 까지
		// 메모리에서 제거 : 선언문이 포함된 } 를 빠져나가면 즉시 삭제
	}
}

//static 멤버는 non-static 멤버에 접근 할 수 없다.
class C{
	int a;
	//static int b = a;
}


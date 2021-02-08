package Java_Thoery;

//주소값 비교(==)와 값 비교(equals)
//==연산자와 String클래스의 equals()메소드의 가장 큰 차이점은 == 연산자는 비교하고자 하는 
//두개의 대상의 주소값을 비교하는데 반해 String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교합니다. 
//일반적인 타입들 int형, char형등은 Call by Value 형태로 기본적으로 대상에 주소값을 가지지 않는 형태로 사용됩니다.
//하지만 String은 일반적인 타입이 아니라 클래스입니다. 클래스는 기본적으로 Call by Reference형태로 생성 시 주소값이 부여됩니다. 
//그렇기에 String타입을 선언했을때는 같은 값을 부여하더라도 서로간의 주소값이 다를 수가 있습니다.

public class StringCompare {
	public static void main(String[] args) {
		String s1 = "abcd";
        String s2 = new String("abcd");
		
        if(s1 == s2) {
            System.out.println("두개의 값이 같습니다.");
        }else {
            System.out.println("두개의 값이 같지 않습니다.");
        }
        
//        == 연산자의 경우 객체의 주소값을 비교하기 때문에 일반 객체처럼 Heap 영역에 생성된 String 객체와 리터럴을
//        이용해 string constant pool에 저장된 String 객체의 주소값은 다를 수밖에 없습니다. 그러므로 두개의 값은 서로 다르다는 결론이 나오게 됩니다. 
//        이러한 경우가 발생할 수 있기에 자바에서 문자열을 비교하려면 equals라는 메서드를 활용하여 두개의 값을 비교해주어야 합니다.
        
        if(s1.equals(s2)) {
            System.out.println("두개의 값이 같습니다.");
        }else {
            System.out.println("두개의 값이 같지 않습니다.");
        }
        
//        String 클래스안에 있는 equals라는 메서드를 사용하면 두 비교대상의 주소 값이 아닌 
//        데이터값을 비교하기 때문에 어떻게 String을 생성하느냐에 따라 결과가 달라지지 않고 정확한 비교를 할 수 있습니다.
	}
}

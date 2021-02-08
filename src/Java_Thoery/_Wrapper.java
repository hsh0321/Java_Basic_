package Java_Thoery;

public class _Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = new Integer(17); // 박싱
		int n = num.intValue(); // 언박싱
		System.out.println(n);

		// 자동 박싱(AutoBoxing)과 자동 언박싱(AutoUnBoxing)

		// 기본타입 값을 직접 박싱, 언박싱하지 않아도 자동적으로 박싱과 언박싱이 일어나는 경우가 있습니다.
		// 자동 박싱의 포장 클래스 타입에 기본값이 대입될 경우에 발생합니다.
		// 예를 들어 int타입의 값을 Integer클래스 변수에 대입하면 자동 박싱이 일어나 힙 영역에 Integer객체가 생성됩니다.
		
		Integer num2 = 17; // 자동 박싱
		int n2 = num2; // 자동 언박싱
		System.out.println(n2);

		
		// 문자열을 기본 타입 값으로 변환
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";

		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);

		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println("문자열 int값 변환 : " + i);
		System.out.println("문자열 short값 변환 : " + s);
		System.out.println("문자열 long값 변환 : " + l);
		System.out.println("문자열 float값 변환 : " + f);
		System.out.println("문자열 double값 변환 : " + d);
		System.out.println("문자열 boolean값 변환 : " + bool);
		
		//	래퍼 클래스의 주요 용도는 기본 타입의 값을 박싱 해서 포장 객체로 만드는 것이지만, 문자열을 기본 타입 값으로 변환할 때에도 사용됩니다. 
		//	대부분의 래퍼 클래스에는 parse + 기본 타입명으로 되어있는 정적 메서드가 있습니다. 이 메서드는 문자열을 매개 값으로 받아 기본 타입 값으로 변환합니다.
	}

}

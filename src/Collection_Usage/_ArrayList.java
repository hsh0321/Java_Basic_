package Collection_Usage;
import java.util.*;

/*Vector와 ArrayList의 주요 차이점
1. 동기화(Synchronize)
Vector는 동기화가 이미 되어 있는 클래스고 ArrayList는 동기화처리가 안된 클래스입니다.
그 때문에 Vector는 한 번에 하나의 쓰레드만 접근 가능하며, ArrayList는 동시에 여러 쓰레드가 접근 가능합니다.
ArrayList에서 여러 쓰레드가 동시에 엑세스 해야하는 경우 개발자가 명시적으로 동기화코드를 추가하면됩니다.
그렇기 때문에 멀티쓰레드 상황이 아닌 환경에선 ArrayList가 더 빠릅니다.

2. 쓰레드 안전(Thread Safe)
스레드 안전이란 멀티 쓰레드 프로그래밍에서 여러 스레드가 동시에 접근이 이루어져도 프로그램 실행에 문제 없음을 뜻합니다. 
앞서 말했듯이 Vector는 동기화 되어 있기 때문에 한 번에 하나의 쓰레드만 접근할 수 있기 때문에 안전합니다.
ArrayList는 동기화되지 않았기 때문에 명시적으로 동기화 할 필요가 없습니다.
 
3. 크기 증가
최대 인덱스를 초과했을 때 추가되는 인덱스의 수가
Vector는 현재 배열의 크기의 100%이며
ArrayList는 현재 배열의 크기의 50%증가.*/

public class _ArrayList {
	public static void main(String[] args) {
		System.out.println();
		
		ArrayList list = new ArrayList(); //타입 미설정 Object로 선언된다.
		ArrayList<Integer> num = new ArrayList<Integer>(); //타입설정 Integer 타입만 사용가능
		ArrayList<Integer> num2 = new ArrayList<>(); //new에서 타입 파라미터 생략가능
		ArrayList<Integer> num3 = new ArrayList<Integer>(10); //초기 용량(capacity)지정
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3)); //생성시 값추가
	
		Integer a = 1;
		Integer b = a+1;
		Integer c = a+b;
		System.out.println(c);
		
		num.add(3); //값 추가
		num.add(null); //null값도 add가능
		num.add(1,10); //index 1뒤에 10 삽입
		num.set(2, 5); // 값 변경
		
		num.remove(1);  //index 1 제거
		num.clear();  //모든 값 제거
		
		
		for(int i=0;i<5;i++)num.add(i);
		
		for(Integer i : num) { //for문을 통한 전체출력
		    System.out.print(i + " ");
		} System.out.println();

		Iterator iter = num.iterator(); //Iterator 선언 
		while(iter.hasNext()){//다음값이 있는지 체크
		    System.out.print(iter.next() + " "); //값 출력
		} System.out.println();
		
		System.out.println(num.contains(1)); //num에 1이 있는지 검색 : true
		System.out.println(num.indexOf(1)); //1이 있는 index반환 없으면 -1
	}
}



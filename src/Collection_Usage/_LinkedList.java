package Collection_Usage;
import java.util.*;

/*다루고자 하는 데이터의 개수가 변하지 않는다면 ArrayList가 최상이겠지만 데이터의 변경이 잦다면 
LinkedList를 사용하는게 더 나은 선택이 될 것이다. 아니면 처음 작업하기 전에 데이터를 저장할 때는 
ArrayList를 사용하고 작업할 때는 LinkedList로 데이터를 옮겨서 작업하면 좋은 효율을 얻을 수 있을 것이다.*/

public class _LinkedList {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();// 타입 미설정 Object로 선언된다.
		LinkedList<Integer> list2 = new LinkedList<Integer>();// 타입설정 int타입만 사용가능
		LinkedList<Integer> list = new LinkedList<>();// new에서 타입 파라미터 생략가능
		LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(1, 2));// 생성시 값추가

		list.clear(); // 모든 값 제거

		for (int i = 0; i < 10; i++)
			list.add(i);

		System.out.println(list);
		list.removeFirst(); // 가장 앞의 데이터 제거
		System.out.println(list);
		list.removeLast(); // 가장 뒤의 데이터 제거
		System.out.println(list);
		list.remove(); // 생략시 0번째 index제거
		System.out.println(list);
		list.remove(1); // index 1 제거
		System.out.println(list);

		System.out.println(list.get(0));// 0번째 index 출력

		for (Integer i : list) { // for문을 통한 전체출력
			System.out.print(i + " ");
		}
		System.out.println();

		Iterator<Integer> iter = list.iterator(); // Iterator 선언
		while (iter.hasNext()) {// 다음값이 있는지 체크
			System.out.print(iter.next() + " "); // 값 출력
		}
		System.out.println();

		System.out.println(list.contains(1)); // list에 1이 있는지 검색 : true
		System.out.println(list.indexOf(5)); // 1이 있는 index반환 없으면 -1
	}
}

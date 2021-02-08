package Collection_Usage;
import java.util.*;


//  중복을 제거하는 동시에 저장한 순서를 유지하고자 한다면 HashSet대신 LinkedHashSet을 사용해야한다.

public class _HashSet {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();//HashSet생성
		HashSet<Integer> set2 = new HashSet<>();//new에서 타입 파라미터 생략가능
		HashSet<Integer> set3 = new HashSet<Integer>(set1);//set1의 모든 값을 가진 HashSet생성
		HashSet<Integer> set4 = new HashSet<Integer>(10);//초기 용량(capacity)지정
		HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f);//초기 capacity,load factor지정
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
	
		HashSet<Integer> set = new HashSet<Integer>();//HashSet생성
		set.add(1); //값 추가
		set.add(2);
		set.add(3);
		
		set.remove(1);//값 1 제거
		set.clear();//모든 값 제거
		
		set.add(1); //값 추가
		set.add(2);
		set.add(3);
		
		System.out.println(set); //전체출력 [1,2,3]
		
		Iterator iter = set.iterator();	// Iterator 사용
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		System.out.println(set.contains(1)); //set내부에 값 1이 있는지 check : true
	}
}

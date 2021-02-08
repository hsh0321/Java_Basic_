package Collection_Usage;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/*이진검색트리라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스이다. 이진 검색트리는 정렬, 검색, 범위검색에 
높은 성능을 보이는 자료구조이며 TreeSet은 이진 검색트리의 성능을 향상시킨 레드-블랙트리로 구현되어있다. 
그리고 Set인터페이스를 구현했으므로 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장순서를 유지하지도 않는다.*/

/*
 * 이진 검색트리의 특징
	-모든 노드는 최대 두 개의 자식노드를 가질 수 있다.
	-왼쪽 자식노드의 값은 부모노드의 값보다 작고 오른쪽자식노드의 값은 부모노드의 값보다 커야한다.
	-노드의 추가 삭제에 시간이 걸린다.(순차적으로 저장하지 않으므로)
	-검색(범위검색)과 정렬에 유리하다.
	-중복된 값을 저장못한다.
*/
public class _TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<Integer>();//TreeSet생성
		TreeSet<Integer> set2 = new TreeSet<>();//new에서 타입 파라미터 생략가능
		TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1의 모든 값을 가진 TreeSet생성
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
		
		TreeSet<Integer> set = new TreeSet<Integer>();//TreeSet생성
			set.add(7); //값추가
		
		set.remove(1);//값 1 제거
		set.clear();//모든 값 제거
		
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);
		
		System.out.println(set); //전체출력 [2,3,4]
		System.out.println(set.first());//최소값 출력
		System.out.println(set.last());//최대값 출력
		System.out.println(set.higher(3));//입력값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println(set.lower(3));//입력값보다 작은 데이터중 최대값 출력 없으면 null
				
		Iterator iter = set.iterator();	// Iterator 사용
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.print(iter.next() + " ");
		}
	}
}

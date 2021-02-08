package Collection_Usage;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*- ArrayDeque : Deque 인터페이스를 구현한 Resizable-Array. external synchronization이 되어있지 않아서 thread-safe하지 않음
- ConcurrentLinkedDeque : Linked node로 이루어진 Concurrent deque
* Concurrent - : multiple thread 환경에서 Element(node)를 삽입, 제거, 접근을 병렬적으로 처리할 수 있도록 하는 컬렉션들
- LinkedBlockingDeque : Linkded node로 이루어진 Deque. Integer.MAX_VALUE의 크기까지만 생성이 가능
- LinkedList : List와 Deque를 구현한 Doubly-Linked List

출처: https://opensourcedev.tistory.com/3 [Open Source 개발자가 되자]
*/

/*(성능차이)
- 양 끝의 데이터를 add / remove할 때 : ArrayDeque > LinkedList
- 반복 작업에서 현재 요소를 삭제할 때 : ArrayDeque < LinkedList*/

public class _Deque {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		Deque<Integer> deque2 = new LinkedList<>();
		
		for(int i=0;i<10;i++)deque.offer(i);
		
		deque.addFirst(98);
		deque.addLast(99);
		
		System.out.println(deque);
		
		deque.removeFirst();
		deque.removeLast(); // 끝 값 삭제
		
		deque.poll();
		deque.pollFirst();
		deque.pollLast(); // 끝 값 반환 및 삭제
		
		deque.peekFirst(); // 첫 값 확인
		deque.peekLast(); // 끝 값 확인
		
		System.out.println(deque);
		
	}
}

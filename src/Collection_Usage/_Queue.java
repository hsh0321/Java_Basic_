package Collection_Usage;
import java.util.LinkedList;
import java.util.Queue;

public class _Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue1 = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
		Queue<String> queue2 = new LinkedList<>(); //String형 queue 선언, linkedlist 이용
		
		Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언
		queue.add(1);     // queue에 값 1 추가
		queue.add(2);     // queue에 값 2 추가
		queue.offer(3);   // queue에 값 3 추가
		
		queue.poll();       // queue에 첫번째 값을 반환	하고 제거 비어있다면 null
		queue.remove();     // queue에 첫번째 값 제거
		queue.peek();       // queue의 첫번째 값 참조
		
		
		System.out.println(queue);
		
		queue.clear();      // queue 초기화
	}

}

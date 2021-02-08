package Collection_Usage;
import java.util.Collections;
import java.util.PriorityQueue;

public class _Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		//int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
		PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

		//String형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
		PriorityQueue<String> priorityQueue3 = new PriorityQueue<>(); 

		//String형 priorityQueue 선언 (우선순위가 높은 숫자 순)
		PriorityQueue<String> priorityQueue4 = new PriorityQueue<>(Collections.reverseOrder());
	
		priorityQueue.add(1);     // priorityQueue 값 1 추가
		priorityQueue.add(2);     // priorityQueue 값 2 추가
		priorityQueue.offer(3);   // priorityQueue 값 3 추가
		
		priorityQueue.poll();       // priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null
		priorityQueue.remove();     // priorityQueue에 첫번째 값 제거
		priorityQueue.clear();      // priorityQueue에 초기화
		
		priorityQueue.offer(2);     // priorityQueue에 값 2 추가
		priorityQueue.offer(1);     // priorityQueue에 값 1 추가
		priorityQueue.offer(3);     // priorityQueue에 값 3 추가
		priorityQueue.peek();       // priorityQueue에 첫번째 값 참조 = 1
		
		System.out.println(priorityQueue);
	}

}

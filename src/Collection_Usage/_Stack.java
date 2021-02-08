package Collection_Usage;
import java.util.*;

public class _Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1 = new Stack<>(); //int형 스택 선언
		Stack<String> stack2 = new Stack<>(); //char형 스택 선언
		
		Stack<Integer> stack = new Stack<>(); //int형 스택 선언
		stack.push(1);     // stack에 값 1 추가
		stack.push(2);     // stack에 값 2 추가
		stack.push(3);     // stack에 값 3 추가
		
		stack.push(1);     // stack에 값 1 추가
		stack.push(2);     // stack에 값 2 추가
		stack.push(3);     // stack에 값 3 추가
		stack.pop();       // stack에 값 제거
		stack.clear();     // stack의 전체 값 제거 (초기화)
		
		stack.push(1);     // stack에 값 1 추가
		stack.push(2);     // stack에 값 2 추가
		stack.push(3);     // stack에 값 3 추가
		stack.peek();     // stack의 가장 상단의 값
		
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.empty();     // stack이 비어있는제 check (비어있다면 true)
		stack.contains(1); // stack에 1이 있는지 check (있다면 true)
	}

}

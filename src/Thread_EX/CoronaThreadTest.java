package Thread_EX;

public class CoronaThreadTest {

	public static void main(String[] args) {
		for (int t = 0; t < 1000; t++) {
			CoronaRunnable cr = new CoronaRunnable(t);
			Thread thread = new Thread(cr);
			thread.start();
		}

		for (int t = 0; t < 1000; t++) {
			CoronaThread thread = new CoronaThread(t);
			thread.start();
		}
		
	}
}

//쓰레드를 구현하는데 Runnable인터페이스를 구현한 것과 Thread클래스를 상속받는 것의 차이는 무엇일까
//쓰레드를 구현하는 방법은 Thread클래스를 상속받는 것과  , Runnable 인터페이스를 구현하는 방법, 모두 2가지가 있다. 이 두가지 방법 중 어느 쪽을 사용해도 별 차이는 없지만 Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없기 때문에 , Runnable 인터페이스를 구현하는 것이 일반적이다.
//
//Runnable인터페이스를 구현하는 방법은 재사용성이 높고 코드의 일관성을 유지할 수 있다는 장점이 있기 때문에 보다 객체지향적인 방법이라 할 수 있다.



//start()와 run()에 대한 차이와 쓰레드가 실행되는 과정
//run()을 호출하는 것은 생성된 쓰레드를 실행시키는 것이 아니라 단순히 클래스에 속한 메서드 하나를 호출하는 것이다. 반면에 start()는 새로운 쓰레드가 작업을 실행하는데 필요한 호출스택을 생성한 다음에 run()을 호출해서, 생성된 호출스택에 run()이 첫번째로 저장되게 한다.

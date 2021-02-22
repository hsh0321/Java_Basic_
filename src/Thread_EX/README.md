# Thread
> - JDK에서 지원하는 java.lang.Thread 제공
- 메모리를 할당받아 실행 중인 프로그램을 프로세스라고 합니다.
- 프로세스 내의 명령어 블록으로 시작점과 종료점을 가진다.
- 실행중에 멈출 수 있으며 동시에 수행 가능하다.
- 어떠한 프로그램내에서 특히 프로세스 내에서 실행되는 흐름의 단위.

### <Thread 생성자>

|||
|---|---|
|Thread()||
|Thread(String s)|스레드 이름|
|Thread(Runnable r)|인터페이스 객체|
|Thread(Runnable r, String s)|인터페이스 객체와 스레드 이름|

### <Thread 메소드>

|||
|---|---|
|static void sleep(long msec) throws Interrupted Exception|msec에 지정된 밀리초 동안 대기|
|String getName()|스레드의 이름을 s로 설정|
|void setName(String s)|스레드의 이름을 s로 설정|
|void start()|스레드를 시작|
|run()| 메소드 호출|
|int getPriority()|스레드의 우선 순위를 반환|
|void setpriority(int p)|스레드의 우선순위를 p값으로|
|boolean isAlive()|스레드가 시작되었고 아직 끝나지 않았으면 true 끝났으면 false 반환|
|void join() throws InterruptedException|스레드가 끝날 때 까지 대기|
|void run()|스레드가 실행할 부분 기술 (오버라이딩 사용)|
|void suspend()|스레드가 일시정지|
|void resume()|일시 정지된 스레드를 다시 시작.|
|void yield()|다른 스레드에게 실행 상태를 양보하고 자신은 준비 상태로|

<br><img src = "https://t1.daumcdn.net/cfile/tistory/2431B74F5964517D32"><br>

## 우선 순위(Priority)
 2개 이상의 스레드가 동작 중일 때 `우선 순위`를 부여하여 우선 순위가 높은 스레드에게 `실행의 우선권`을 부여할 수 있습니다.

- 우선 순위를 지정하기 위한 상수를 제공
- static final int MAX_PRIORITY : 우선순위 10 - 가장 높은 우선 순위
- static final int MIN_PRIORITY  :  우선순위 1 - 가장 낮은 우선 순위
- static final int NORM_PRIORITY : 우선순위 5 - 보통의 우선 순위

- 스레드 우선 순위는 변경 가능
    - void setPriority(int priority)
    - int getPriority()
    - main()스레드의 우선 순위 값은 `초기값이 5`
    
- JVM의 스케쥴링 규칙
    - 철저한 우선 순위 기반
    - 가장 높은 우선 순위의 스레드가 우선적으로 스케쥴링
    - 동일한 우선 순위의 스레드는 돌아가면서 스케쥴링(라운드 로빈)

> 출처: https://raccoonjy.tistory.com/15


## 멀티 스레드(Multi Thread)
- 여러 개의 스레드가 동시에 수행되면서 공유할 수 있을때
- 공유되는 부분은 상호 배타적으로 사용되어야 합니다.
    -`Dead Lock` 문제
        - 멀티 스레드를 사용할 때 주의할 점중의 하나로 프로그램에서 스레드를 잘못 만들면 프로그램의 수행이 이루어 지지 않고 무한 수행하는 Dead Lock을 만들 수 있습니다.
    - `임계 영역`(critical section)
        - 공유 자원을 사용하는 코드영역을 임계영역이라 합니다.
        - 이 부분에서는 공유 자원을 동시에 수정할 수 없도록 상호 배타적으로 실행될 수 있도록 작성되어야 합니다.
    
- 자바에서 상호배제 문제를 해결하는 방법
    - 자바는 한 순간에 하나의 스레드만 실행할 수 있는 synchronized method 제공
    - 한 스레드가 synchronized method를 수행 중이면 다른 스레드는 대기합니다.



- 처리방법
    - 공유 자원에 접근하는 메소드의 앞에 `synchronized` 메소드로 지정 합니다.
    - 공유 자원을 사용하는 영역을 synchronized(객체명)의 블록으로 지정합니다.
    
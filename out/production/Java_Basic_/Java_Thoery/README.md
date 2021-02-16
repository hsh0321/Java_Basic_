## String, StringBuffer, StringBuilder 차이 및 장단점

* Java 에서 문자열을 다루를 대표적인 클래스로 String , StringBuffer, StringBuilder 가 있습니다. 
연산이 많지 않을때는 위에 나열된 어떤 클래스를 사용하더라도 이슈가 발생할 가능성은 거의 없습니다. 
그러나 연산횟수가 많아지거나 멀티쓰레드, Race condition 등의 상황이 자주 발생 한다면 각 클래스의 특징을 이해하고 상황에 맞는 적절한 클래스를 사용해 주셔야 합니다!

### String  vs  StringBuffer/StringBuilder

* String과 StringBuffer/StringBuilder 클래스의 가장 큰 차이점은 String은 불변(immutable)의 속성을 갖는다는 점입니다.

``` java
String str = "hello";   // String str = new String("hello");
str = str + " world";  // [ hello world ]
```

* 직관적이어서 가장 많이 사용할 듯한 위의 예제에서 "hello" 값을 가지고 있던 String 클래스의 참조변수 str이 가리키는 곳에 저장된 "hello"에 "world" 문자열을 더해 "hello world"로 변경한 것으로 착각할 수 있습니다.

* 하지만 기존에 "hello" 값이 들어가있던 String 클래스의 참조변수 str이 "hello world"라는 값을 가지고 있는 새로운 메모리영역을 가리키게 변경되고 처음 선언했던 "hello"로 값이 할당되어 있던 메모리 영역은 Garbage로 남아있다가 GC(garbage collection)에 의해 사라지게 되는 것 입니다. String 클래스는 불변하기 때문에 문자열을 수정하는 시점에 새로운 String 인스턴스가 생성된 것이지요.

<p><img src = "https://t1.daumcdn.net/cfile/tistory/99948B355E2F13350F"><p/>

* 이를 해결하기 위해 Java에서는 가변(mutable)성을 가지는 StringBuffer / StringBuilder 클래스를 도입했습니다.
String 과는 반대로 StringBuffer/StringBuilder 는 가변성 가지기 때문에 .append() .delete() 등의 API를 이용하여 동일 객체내에서 문자열을 변경하는 것이 가능합니다. 따라서 문자열의 추가,수정,삭제가 빈번하게 발생할 경우라면 String 클래스가 아닌 StringBuffer/StringBuilder를 사용하셔야 합니다.

``` java
StringBuffer sb= new StringBuffer("hello"); 
sb.append(" world");
```
<p><img src="https://t1.daumcdn.net/cfile/tistory/9923A9505E2F133608"><p\>

출처: [IfUwanna IT](https://ifuwanna.tistory.com/221)

## 자바 배열을 복사하는 다양한 방법 (깊은복사, 얕은복사)

* 자바에서 객체를 복사하는 유형으로 깊은 복사와 얕은 복사가 있습니다. 
깊은 복사의 경우 객체의 실제값을 새로운 객체로 복사하는 것이고 얕은 복사는 단순히 객체의 주소 값만을 복사하는 것입니다. 
얕은 복사로 객체가 복사된다면 실제로는 하나의 주소 값을 가지고 있으므로 하나라고 볼 수 있습니다. 
그렇기에 대개 객체를 복사한다는 말은 얕은 복사가 아닌 깊은 복사를 의미합니다.

#### 배열 복사의 잘못된 예 (얕은 복사)
<p><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdcztLY%2FbtqEdw8rhs2%2FkfKCON22rztvxymZQ2bTM0%2Fimg.png" height="60%""></p>
	
#### 배열 복사의 올바른 예 (깊은 복사)
<p><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbgiQe4%2FbtqEcTQMCQq%2FkiCQNPj2Jklyozk8EXKWpK%2Fimg.png" height="60%""></p>

#### 2차원 배열의 깊은 복사
<p><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FKcdJ9%2FbtqEdwUW5nS%2FYRRES1rLqvnTpQlKGpB1p1%2Fimg.png" height="60%""></p>

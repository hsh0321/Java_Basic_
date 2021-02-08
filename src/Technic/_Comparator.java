package Technic;

import java.util.Arrays;
import java.util.Comparator;

/* 비교기
 * 2. 내부 비교기 Comparable compareTo() 클래스 내부에 정의 implements Comparable
 * 1. 외부 비교기 Comparator compare (T o1, T o2) or 람다 표현식
*/

public class _Comparator {
	public static void main(String[] args) {
		Car[] crr = new Car[3];
		crr[0] = new Car(100,"아반떼");
		crr[1] = new Car(50,"티코");
		crr[2] = new Car(120,"그랜저");
		
		for(Car elem : crr)System.out.println(elem);
		System.out.println("=====오름차순=====");
		for(Car elem : crr)System.out.println(elem);
		Arrays.sort(crr); // 내부 비교기
		System.out.println("=====내림차순=====");
		Arrays.sort(crr,new Comparator<Car>() { // 외부 비교기
			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o2.speed - o1.speed; // 내림차순
			}
		});
		
		Arrays.sort(crr,(o1,o2)->{ // 람다표현식
			return o1.speed - o2.speed; // 오름차순
		});
		
		for(Car elem : crr)System.out.println(elem);
		

	}
}


class Car implements Comparable{
	int speed;
	String name;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) { // 내부 비교기
		if(o instanceof Car) {
			Car c = (Car)o;
			return this.speed - c.speed;
		}
		return 0;
	}
}
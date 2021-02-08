package Technic;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		try { // 예외가 발생할 우려있는 코드
			System.out.println(1);
	
			if(true) {
				throw new Exception();
			}
			
			int a= 3 / 0; // ArithmeticException
			System.out.println(2);
		}catch(ArithmeticException e) { // try 블럭에서 예외 발생시 처리할 코드
			System.err.println(3);
		}catch(RuntimeException e) {
			System.err.println(4);
		}catch(Exception e) {
			System.err.println(5);
		}finally { // 꼭 실행해야하는 것.
			System.out.println(6);
		}
		System.out.println(7);
		
		
		try(Scanner sc = new Scanner(System.in);){ // AutoCloseable
			
		}catch(Exception e) {
			
		}
	} // end of main
} // end of class

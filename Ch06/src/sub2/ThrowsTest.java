package sub2;

import java.util.Scanner;

/**
 * 이름 : 김병준
 * 날짜 : 2023/06/26
 * 내용 : Java Throw 실습하기 
 */
public class ThrowsTest {
	
	public static void main(String[] args) {
		try {
			myMethod1(10);
		}catch (Exception e) {
			System.out.println("프로그램 정상 종료...");
		}
	}
	
	public static void myMethod1(int n1) throws Exception { // myMethod1 호출한 곳으로 예외 던지기
		myMethod2(n1);
	}
	
	public static void myMethod2(int n1) throws Exception { // myMethod2 호출한 곳으로 예외 던지기
	
		Scanner scan = new Scanner(System.in);
		System.out.println("n2 입력 : ");
		int n2 = scan.nextInt(); // InputMismatchException 발생 가능
		int result = n1 / n2;	 // ArithmeticException 발생 가능
		
		System.out.println("result : " + result);
	}


}

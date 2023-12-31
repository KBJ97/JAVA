package sub4;

/**
 * 날짜 : 2023/06/20
 * 이름 : 김병준
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 * 
 * 클래스 변수 , 클래스 메서드 (정저변수, 정적메서드)
 * -static을 선언한 변수, 메서드로 Method Area에 생성
 * -별도의 객체생성 new를 하지 않고 클래스 타입으로 참조
 * -객체(인스턴스)를 간의 공유 목적으로 클래스변수, 클래스메서드 사용
 * 
 * 싱글톤 객체(Singleton)
 * -static을 활용한 깅글톤객체는 오직 하나의 인스턴스로 메모리상에 존재
 * -싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */

class Adder{
	
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() {}
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	
	public void add(int [] arr) {
		x += arr[0];
		y += arr[1];
	}
	public static void add(Adder a2) {
		a2.x += 10;
		
	}
	public static Adder add(Adder a2, int value) {
		return new Adder (value);
	}
	public void show() {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
	}
	
}



public class AdderTest {
	
	public static void main (String[] args) {
		
		Adder a1 = Adder.getInstance();
		
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10,20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1,3);
		a1.show();
		
	}
}

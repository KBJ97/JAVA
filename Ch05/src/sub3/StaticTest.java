package sub3;


/**
 * 날짜 : 2023/06/20
 * 이름 : 김병준
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 */

class Increment {
	private int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 :"+ num1);
		System.out.println("num2 :"+ num2);
	}	
}

public class StaticTest {
	
	public static void main(String[] args) {
		
		// Increment 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		
		// Car 실습
		Car sonata = new Car("소나타","흰색",10);
		Car avante = new Car("아반테","검정",20);
		Car grande = new Car("그랜져","남색",30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		// 클래스 변수 창조
		System.out.print("전체 차량수 :"+ Car.count); 
		
		// 클래스 메서드 호출
		System.out.println("현재 차량수 :"+ Car.getCount());
		
		// 싱글톤 객체 실습
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);
		
		System.out.println("result1 :"+ result1);
		System.out.println("result2 :"+ result2);
		
		
	} 
}

package confirm.ch04;

public class Test4 {
	public static void main(String[] args) {
		// 4번
		
		
		while(true) {
			int num1 = (int) Math.ceil(Math.random() * 6);
			int num2 = (int) Math.ceil(Math.random() * 6);
			
			System.out.println("(" + num1 + ", " + num2 + ")");
			
			int tot = num1 + num2;
			if(tot == 5) {
				break;
			}
		}
		
		
	}
}
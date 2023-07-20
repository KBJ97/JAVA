package confirm.ch04;

public class Test5 {
	public static void main(String[] args) {
		// 5번
		for(int x=1 ; x<=10 ; x++) {
			
			for(int y=1 ; y<=10 ; y++) {
				
				int result = 4 * x + 5 * y;
				
				if(result == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
				
			}
			
		}
		
		
	}
}
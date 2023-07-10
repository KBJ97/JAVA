package TestEx;

public class Test2 {
	public static void main(String[] args) {
		        
		int st = 4;

		        for (int i = 1; i <= st; i++) {
		            for (int j = 1; j <= st - i; j++) {
		                System.out.print("☆");
		            }
		            
		            for (int k = 1; k <= i * 2 - 1; k++) {
		                    System.out.print("★");
		                }
		            
		            for (int j = 1; j <= st - i; j++) {
		                System.out.print("☆");
		            }
		            
		            System.out.println();
		        }

	}
}






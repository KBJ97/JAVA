package TestEx;

import java.util.Scanner;

public class Test1 {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("예제입력");
        int N = input.nextInt();
        
        if (N < 1 || N > 100) {
            System.out.println("1 ≤ 입력값 ≤ 100");
            return; 
        }
        
        System.out.println("예제출력");
        for (int i = 1; i <= N; i++) {
            int b = N - i;
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}





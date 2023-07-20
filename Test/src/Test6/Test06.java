package Test6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void printArray(String title, int[] array) {
        System.out.println(title);
        for (int i = 0; i < array.length; i++)
            System.out.printf("%5d%s", array[i], (i % 10 == 9) ? "\n" : "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int[] values = new int[30];

        for (int i = 0; i < 30; i++)
            values[i] = random.nextInt(1000);

        printArray("정렬 전", values);

        Arrays.sort(values);
        printArray("정렬 후", values);

        System.out.print("=> 검색할 숫자 입력: ");
        int findNum = sc.nextInt();
        int count = 0;

        // 선형 탐색
        for (int i = 0; i < values.length; i++) {
            count++;
            if (values[i] == findNum) {
                System.out.printf("values[%d] = %d\n", i, findNum);
                System.out.printf("선형 탐색 비교 횟수: %d회\n", count);
                break;
            }
        }

        count = 0;
        int low = 0;
        int high = values.length - 1;

        // 이진 탐색
        while (low <= high) {
            count++;
            int mid = (low + high) / 2;

            if (values[mid] == findNum) {
                System.out.printf("values[%d] = %d\n", mid, findNum);
                System.out.printf("이진 탐색 비교 횟수: %d회\n", count);
                break;
            } else if (findNum > values[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}
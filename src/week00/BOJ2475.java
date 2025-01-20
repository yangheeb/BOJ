package week00;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 수열 A에서 X보다 작은 수를 모두 출력
            // A에 있는 수를 반복문을 돌려서 X와 비교
            // X보다 작은 수만 출력

            // 1. 스캐너를 통해 값을 입력받기
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = scanner.nextInt();
            } // 정렬 단축키는 Ctrl + Alt + L

            // 2. 반복문과 조건문을 통해 비교
            for (int i = 0; i < A.length; i++) {
                if (A[i] < X) {
                    System.out.println(A[i]);
                }
            }
        }
    }


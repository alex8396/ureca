import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력값 받기
        
        // 직각 이등변 삼각형 출력
        for (int i = 1; i <= n; i++) {
            // i개의 '*'을 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
        
        sc.close(); // Scanner 닫기
    }
}

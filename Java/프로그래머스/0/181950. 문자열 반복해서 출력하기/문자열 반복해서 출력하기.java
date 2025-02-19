import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열과 반복 횟수 입력 받기
        String str = sc.next();
        int n = sc.nextInt();
        
        // 문자열을 n번 반복해서 출력
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        
        sc.close();
    }
}

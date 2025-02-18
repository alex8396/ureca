import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력 받기
        String str = sc.next();
        
        // 문자열의 길이만큼 반복하여 각 문자를 새로운 줄에 출력
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        
        // 스캐너 객체 닫기
        sc.close();
    }
}

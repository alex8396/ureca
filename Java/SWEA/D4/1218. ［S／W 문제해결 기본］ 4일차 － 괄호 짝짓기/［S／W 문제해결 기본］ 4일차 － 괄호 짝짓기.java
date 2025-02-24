import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static void main(String args[]) throws Exception {
        // 표준 입력을 통해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 10개의 테스트 케이스 처리
        for (int test_case = 1; test_case <= 10; test_case++) {
            // 첫 번째 줄에서 괄호 문자열의 길이를 받지만, 실제로 사용하지 않습니다.
            int length = sc.nextInt();
            // 두 번째 줄에서 괄호 문자열을 받습니다.
            String str = sc.next();

            // 스택을 사용하여 괄호의 짝을 맞추기
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            // 문자열을 하나씩 확인하며 유효성 검사
            for (int i = 0; i < length; i++) {
                char ch = str.charAt(i);

                // 열린 괄호는 스택에 넣기
                if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                    stack.push(ch);
                }
                // 닫힌 괄호가 나오면 짝을 맞추기
                else if (ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    // 짝이 맞지 않으면 유효하지 않음
                    if ((ch == ')' && top != '(') || 
                        (ch == '}' && top != '{') || 
                        (ch == ']' && top != '[') || 
                        (ch == '>' && top != '<')) {
                        isValid = false;
                        break;
                    }
                }
            }

            // 스택이 비지 않으면 여는 괄호가 남아있다는 뜻으로 유효하지 않음
            if (!stack.isEmpty()) {
                isValid = false;
            }

            // 결과 출력
            System.out.println("#" + test_case + " " + (isValid ? 1 : 0));
        }

        // Scanner 자원 해제
        sc.close();
    }
}

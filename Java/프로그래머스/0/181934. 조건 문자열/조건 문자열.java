class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            return n <= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            return n < m ? 1 : 0;
        }
        return 0; // 예외 경우는 없음 (제한사항 내에서 항상 올바른 입력이 주어짐)
    }
}

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];  // 결과를 담을 배열

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");  // 수식을 공백 기준으로 분리
            
            int num1 = Integer.parseInt(parts[0]);  // 첫 번째 숫자
            String operator = parts[1];             // 연산자
            int num2 = Integer.parseInt(parts[2]);  // 두 번째 숫자
            int result = Integer.parseInt(parts[4]); // 결과 값

            // 연산 수행
            int calculatedResult = 0;
            if (operator.equals("+")) {
                calculatedResult = num1 + num2;
            } else if (operator.equals("-")) {
                calculatedResult = num1 - num2;
            }

            // 수식이 맞으면 "O", 틀리면 "X"
            if (calculatedResult == result) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}

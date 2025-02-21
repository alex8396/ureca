class Solution {
    public String solution(String polynomial) {
        // 변수와 상수 초기화
        int xCoefficient = 0; // x의 계수
        int constant = 0;     // 상수 항

        // 공백을 기준으로 항들을 나눔
        String[] terms = polynomial.split(" \\+ ");
        
        for (String term : terms) {
            // "x"를 포함하는 항인지 확인
            if (term.contains("x")) {
                // "x" 항에서 계수 부분을 처리
                if (term.equals("x")) {
                    xCoefficient += 1;  // "x"는 계수 1
                } else if (term.equals("-x")) {
                    xCoefficient -= 1;  // "-x"는 계수 -1
                } else {
                    // "3x", "-3x" 등의 형태
                    int coefficient = Integer.parseInt(term.replace("x", ""));
                    xCoefficient += coefficient;
                }
            } else {
                // "x"가 없는 항은 상수 항
                constant += Integer.parseInt(term);
            }
        }

        // 결과 문자열 만들기
        StringBuilder result = new StringBuilder();

        if (xCoefficient != 0) {
            if (xCoefficient == 1) {
                result.append("x");
            } else if (xCoefficient == -1) {
                result.append("-x");
            } else {
                result.append(xCoefficient).append("x");
            }
        }

        if (constant != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        // 만약 x항도 없고 상수항도 없다면 0을 출력
        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}

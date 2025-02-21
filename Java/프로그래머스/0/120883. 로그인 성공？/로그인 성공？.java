class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        for (String[] account : db) {
            String dbId = account[0];
            String dbPw = account[1];

            if (inputId.equals(dbId)) { // 아이디가 일치하는 경우
                if (inputPw.equals(dbPw)) {
                    return "login"; // 비밀번호까지 일치
                } else {
                    return "wrong pw"; // 비밀번호 불일치
                }
            }
        }
        return "fail"; // 아이디가 없음
    }
}

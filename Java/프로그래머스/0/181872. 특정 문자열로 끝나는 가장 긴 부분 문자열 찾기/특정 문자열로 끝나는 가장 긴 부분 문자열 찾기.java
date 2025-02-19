class Solution {
    public String solution(String myString, String pat) {
        // myString의 끝에서부터 pat이 등장하는 마지막 인덱스를 찾기
        int endIndex = myString.lastIndexOf(pat);
        
        // 그 위치까지의 부분 문자열을 리턴
        return myString.substring(0, endIndex + pat.length());
    }
}

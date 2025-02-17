import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        // s1의 원소를 HashSet에 저장
        HashSet<String> set1 = new HashSet<>();
        for (String str : s1) {
            set1.add(str);
        }
        
        // s2 배열의 원소와 s1의 원소가 겹치는지 확인
        int count = 0;
        for (String str : s2) {
            if (set1.contains(str)) {
                count++;  // 공통된 원소가 있으면 카운트 증가
            }
        }
        
        return count;  // 공통된 원소의 개수 반환
    }
}

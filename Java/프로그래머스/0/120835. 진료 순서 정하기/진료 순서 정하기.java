class Solution {
    public int[] solution(int[] emergency) {
        // 응급도의 순위를 매기기 위해 emergency 배열을 복사하여 정렬
        int[] sortedEmergency = emergency.clone();
        java.util.Arrays.sort(sortedEmergency);
        
        // 응급도가 높은 순서대로 번호를 매긴 결과를 담을 배열
        int[] answer = new int[emergency.length];
        
        // 원본 배열의 값에 대해 순위 매기기
        for (int i = 0; i < emergency.length; i++) {
            // sortedEmergency 배열에서 응급도 값이 위치한 인덱스를 찾기
            int rank = java.util.Arrays.binarySearch(sortedEmergency, emergency[i]);
            answer[i] = emergency.length - rank;  // 순위를 반영 (내림차순)
        }
        
        return answer;
    }
}

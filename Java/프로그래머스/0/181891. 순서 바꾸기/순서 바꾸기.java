class Solution {
    public int[] solution(int[] num_list, int n) {
        // n 번째 원소 이후의 원소들
        int[] afterN = new int[num_list.length - n];
        System.arraycopy(num_list, n, afterN, 0, num_list.length - n);
        
        // n 번째까지의 원소들
        int[] beforeN = new int[n];
        System.arraycopy(num_list, 0, beforeN, 0, n);
        
        // 두 배열을 합친 결과를 반환
        int[] answer = new int[num_list.length];
        System.arraycopy(afterN, 0, answer, 0, afterN.length);
        System.arraycopy(beforeN, 0, answer, afterN.length, beforeN.length);
        
        return answer;
    }
}

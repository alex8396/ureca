class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr.append(num); // 짝수 추가
            } else {
                oddStr.append(num);  // 홀수 추가
            }
        }

        return Integer.parseInt(oddStr.toString()) + Integer.parseInt(evenStr.toString());
    }
}

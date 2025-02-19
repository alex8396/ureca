class Solution {
    public int solution(int[] date1, int[] date2) {
        // 날짜를 순차적으로 비교
        if (date1[0] < date2[0]) {
            return 1;  // date1의 year가 더 작으면 date1이 앞선 날짜
        } else if (date1[0] > date2[0]) {
            return 0;  // date1의 year가 더 크면 date1이 뒤
        } else {  // year가 같다면 month를 비교
            if (date1[1] < date2[1]) {
                return 1;  // date1의 month가 더 작으면 date1이 앞선 날짜
            } else if (date1[1] > date2[1]) {
                return 0;  // date1의 month가 더 크면 date1이 뒤
            } else {  // month가 같다면 day를 비교
                if (date1[2] < date2[2]) {
                    return 1;  // date1의 day가 더 작으면 date1이 앞선 날짜
                } else {
                    return 0;  // date1의 day가 같거나 더 크면 date1이 뒤
                }
            }
        }
    }
}

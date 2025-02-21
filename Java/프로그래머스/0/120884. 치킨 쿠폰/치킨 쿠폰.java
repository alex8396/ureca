class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken; // 처음 받은 치킨 수가 쿠폰 수

        while (coupon >= 10) { // 쿠폰이 10장 이상일 때 반복
            int serviceChicken = coupon / 10; // 받을 수 있는 서비스 치킨 수
            answer += serviceChicken; // 서비스 치킨 수를 더함
            coupon = coupon % 10 + serviceChicken; // 남은 쿠폰 + 새로 받은 쿠폰
        }

        return answer;
    }
}

class Solution {
    public long solution(String numbers) {
        // 영어 숫자와 실제 숫자를 매핑
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 해당 단어를 숫자로 변환
        for (int i = 0; i < 10; i++) {
            numbers = numbers.replace(numberWords[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers); // 변환된 숫자를 long 타입으로 변환 후 반환
    }
}

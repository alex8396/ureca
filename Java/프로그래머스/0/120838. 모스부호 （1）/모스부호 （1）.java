import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        // 모스 부호와 알파벳을 매핑하는 HashMap 생성
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        
        // 주어진 letter를 공백 기준으로 분리
        String[] words = letter.split(" ");
        StringBuilder result = new StringBuilder();
        
        // 각각의 모스 부호를 알파벳으로 변환하여 result에 추가
        for (String word : words) {
            result.append(morse.get(word));
        }
        
        return result.toString();
    }
}

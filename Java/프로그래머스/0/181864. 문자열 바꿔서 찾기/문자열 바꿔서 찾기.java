class Solution {
    public int solution(String myString, String pat) {
       
        String swapped = myString.replace("A", "X").replace("B", "A").replace("X", "B");
        
        
        if (swapped.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}

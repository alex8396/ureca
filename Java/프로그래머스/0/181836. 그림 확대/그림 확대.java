class Solution {
    public String[] solution(String[] picture, int k) {
        int originalRows = picture.length;
        int originalCols = picture[0].length();
        String[] enlargedPicture = new String[originalRows * k];

        int index = 0; // 결과 배열의 인덱스

        for (String row : picture) {
            StringBuilder enlargedRow = new StringBuilder();
            
            // 각 문자 반복하여 가로로 k배 확대
            for (char c : row.toCharArray()) {
                enlargedRow.append(String.valueOf(c).repeat(k));
            }

            // 세로로 k배 확대
            String rowString = enlargedRow.toString();
            for (int i = 0; i < k; i++) {
                enlargedPicture[index++] = rowString;
            }
        }

        return enlargedPicture;
    }
}

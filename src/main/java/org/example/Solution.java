package org.example;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int diagonalLength = numRows - 2;
        StringBuilder sb = new StringBuilder();
        recursive(s, numRows, diagonalLength, sb, 0);
        return sb.toString();
    }

    private StringBuilder recursive(String string,
                                    int numRows,
                                    int diagonalLength,
                                    StringBuilder sb,
                                    int currentRowNumber) {
        if (currentRowNumber == numRows) return sb;
        for (int i = currentRowNumber; i < string.length(); i += numRows + diagonalLength) {
            sb.append(string.charAt(i));
            if (currentRowNumber != 0 && currentRowNumber != numRows - 1) {
                int diagonalIndex = i + 2 * (numRows - currentRowNumber - 1);
                if (diagonalIndex < string.length()) {
                    sb.append(string.charAt(diagonalIndex));
                }
            }
        }
        return recursive(string, numRows, diagonalLength, sb, ++currentRowNumber);
    }

}
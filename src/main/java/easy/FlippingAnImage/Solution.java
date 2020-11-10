package easy.FlippingAnImage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] invertImage = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                invertImage[i][j] = Math.abs(1 - A[i][A.length - 1 - j]);
            }
        }

        return invertImage;
    }
}

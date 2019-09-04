package problems;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        System.out.println();
    }
    public int[][] flipAndInvertImage(int[][] A) {
        int row=A.length;
        int col=A[0].length;
        int[][] result=new int[row][col];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                result[i][A[i].length-j-1]=A[i][j]^1;
            }
        }
        return result;
    }
}

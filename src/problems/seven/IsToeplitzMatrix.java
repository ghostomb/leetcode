package problems.seven;

public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //todo
        boolean isToeplitz=true;
        int N=matrix.length;
        int M=matrix[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i; j++) {
                if(matrix[i+j][j]!=matrix[N-j-1][N-i-j-1]){
                    isToeplitz=false;
                }
            }
        }

        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N-i; j++) {
                if(matrix[i][j+i]!=matrix[N-j-i-1][N-i-1]){
                    isToeplitz=false;
                }
            }
        }
        return isToeplitz;
    }
}

package problems;

public class SortArrayByParity {
    public static void main(String[] args) {
        System.out.println();
    }
    public int[] sortArrayByParity(int[] A) {
        int length=A.length;
        int[] result=new int[length];
        int begin=0,end=0;
        for (int k = 0; k < A.length; k++) {
            if(A[k]%2==0){
                result[begin++]=A[k];
            }else {
                result[length-end++-1]=A[k];
            }
        }
        return result;
    }
}

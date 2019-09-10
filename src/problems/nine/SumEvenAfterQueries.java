package problems.nine;

public class SumEvenAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result=new int[A.length];
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                sum+=A[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int val=queries[i][0];
            int aIndex=queries[i][1];
            if((A[aIndex]+val)%2==0){
                if(A[aIndex]%2==0){
                    sum+=val;
                }else {
                    sum+=A[aIndex]+val;
                }
            }else {
                if(A[aIndex]%2==0){
                    sum-=A[aIndex];
                }
            }
            A[aIndex]=A[aIndex]+val;
            result[i]=sum;
        }
        return result;
    }
}

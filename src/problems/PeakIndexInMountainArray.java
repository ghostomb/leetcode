package problems;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0,2}));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int up=0,down=0;
        boolean flag=true;
        for (int i = 0; i < A.length-1; i++) {
            if(flag && A[i]<A[i+1]){
                up++;
                continue;
            }else if(A[i]>A[i+1]){
                down++;
                flag=false;
            }
        }
        if(up+down==A.length-1){
            return up;
        }
        return 0;

    }
}

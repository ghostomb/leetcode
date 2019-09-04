package problems.ten;

public class DuplicateZeros {

    public static void main(String[] args) {
        duplicateZeros(new int[]{1,2,3});
    }
    public static void duplicateZeros(int[] arr) {
        int start=0;
        while(start<arr.length-1){
            int end=arr.length-1;
            if(arr[start]==0){
                while (end>start+1){
                    arr[end]=arr[end-1];
                    end--;
                }
                arr[start+1]=0;
            }
            start++;
        }
    }
}

package problems;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        relativeSortArray(new int[]{28,6,22,8,44,17},new int[]{22,28,8,6});

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i]==arr1[j]){
                    result.add(arr2[i]);
                }
            }
        }
        List<Integer> other=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if(result.contains(arr1[i])){
                continue;
            }else {
                other.add(arr1[i]);
            }
            
        }
        Collections.sort(other);
        if(other.size()>0){
            for (int i = 0; i <other.size(); i++) {
                result.add(other.get(i));
            }
        }

        int[] a=new int[arr1.length];
        for (int i = 0; i < result.size(); i++) {
            a[i]=result.get(i);
        }
        return a;
    }
}

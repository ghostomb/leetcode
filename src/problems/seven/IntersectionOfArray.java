package problems.seven;

import java.util.*;

public class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1= arrayToSet(nums1);
        Set<Integer> set2= arrayToSet(nums2);
        set1.retainAll(set2);
        return setToArray(set1);
    }

    private Set<Integer> arrayToSet(int[] array) {
        Set<Integer> result=new HashSet<>();
        for (Integer i:array) {
            result.add(i);
        }
        return result;
    }

    private int[] setToArray(Set<Integer> set) {
        int[] result= new int[set.size()];
        int index=0;
        for (int i:set) {
            result[index++]=i;
        }
        return result;
    }
}

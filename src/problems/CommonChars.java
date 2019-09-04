package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.min;

public class CommonChars {
    public List<String> commonChars(String[] A) {
        int[] charTimes=new int[26];
        Arrays.fill(charTimes,Integer.MAX_VALUE);
        for (int i = 0; i < A.length; i++) {
            int[] tempTimes=new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                tempTimes[A[i].charAt(j)-'a']++;
            }
            for (int j = 0; j < tempTimes.length; j++) {
                charTimes[j]=Integer.min(tempTimes[j],charTimes[j]);
            }
        }

        List<String> result=new ArrayList<>();
        for (int i = 0; i < charTimes.length; i++) {
            if(charTimes[i]!=Integer.MAX_VALUE){
                for (int j = 0; j < charTimes[i]; j++) {
                    result.add(String.valueOf((char) i+'a'));
                }
            }
        }
        return result;
    }
}

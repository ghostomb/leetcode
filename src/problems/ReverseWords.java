package problems;

import java.util.*;

public class ReverseWords {
    public String reverseWords(String s){
        String[] word=s.split(" ");
        List<String> result=new ArrayList<>();
        for (int i = 0; i < word.length; i++) {
            String temp=new StringBuilder(word[i]).reverse().toString();
            result.add(temp);
        }
        return String.join(" ",result);
    }
}

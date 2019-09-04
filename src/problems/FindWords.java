package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {
    public static void main(String[] args) {
        findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    }
    public static String[] findWords(String[] words) {
        List<String> list=new ArrayList<>();
        List<Character> first= new ArrayList<Character>(Arrays.asList(new Character[]{'q','w','e','r','t','y','u','i','o','p'}));
        List<Character> second=new ArrayList<Character>(Arrays.asList(new Character[]{'a','s','d','f','g','h','j','k','l'}));
        List<Character> third =new ArrayList<Character>(Arrays.asList(new Character[]{'z','x','c','v','b','n','m'}));
        for (int i = 0; i < words.length; i++) {
            int a=0,b=0,c=0;
            for (int j = 0; j < words[i].length(); j++) {
                if(first.contains(words[i].toLowerCase().toCharArray()[j])){
                    a++;
                }
                if(second.contains(words[i].toLowerCase().toCharArray()[j])){
                    b++;
                }
                if(third.contains(words[i].toLowerCase().toCharArray()[j])){
                    c++;
                }
            }
            if(a==words[i].length()||b==words[i].length()||c==words[i].length()){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}

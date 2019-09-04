package problems;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public static void main(String[] args) {
        String[] words=new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode=new String[]{
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> set=new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder morseString =new StringBuilder();
            char[] chars=words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                morseString.append(morseCode[chars[j]-'a']);
            }
            set.add(morseString.toString());
        }
        return set.size();
    }
}

package problems;

import java.util.HashSet;
import java.util.Set;

public class CountCharacters {
    public static void main(String[] args) {
        String[] words = new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
                "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb",
                "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
                "boygirdlggnh",
                "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
                "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
                "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
                "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr",
                "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo",
                "oxgaskztzroxuntiwlfyufddl",
                "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
                "qnagrpfzlyrouolqquytwnwnsqnmuzphne",
                "eeilfdaookieawrrbvtnqfzcricvhpiv",
                "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz",
                "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
                "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv",
                "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo",
                "teyygdmmyadppuopvqdodaczob",
                "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        String chars="usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        System.out.println(countCharacters(words,chars));

    }
    public static int countCharacters(String[] words, String chars) {
                int totalLength=0;
                for (int i = 0; i < words.length; i++) {
                    char[] cc=words[i].toCharArray();
                    Set<String> stringSet=new HashSet<>();
                    for (int j = 0; j < words[i].length(); j++) {
                        if(chars.contains(Character.toString(cc[j]))){
                            stringSet.add(Character.toString(cc[j]));
                        }
                    }
                    if(stringSet.size()==words[i].length()){
                        totalLength+=words[i].length();
                    }
                }
                return totalLength;
    }
}

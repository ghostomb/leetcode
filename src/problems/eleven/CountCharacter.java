package problems.eleven;

public class CountCharacter {
    public int countCharacters(String[] words, String chars) {
        int[] charNum=new int[27];
        for (char ch:chars.toCharArray()) {
            charNum[ch-97]++;
        }
        for (String word:words) {
            boolean addFlag=true;
            int[] charTemp=charNum.clone();
            for (char c:word.toCharArray()) {
                if(charTemp[c-97]==0){
                    addFlag=false;
                    break;
                }else {
                    charTemp[c-97]--;
                }
            }
            if(addFlag){
                charNum[26]+=word.length();
            }
        }
        return charNum[26];
    }
}

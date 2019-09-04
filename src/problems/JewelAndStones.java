package problems;

public class JewelAndStones {
    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));

    }
    public static int numJewelsInStones(String J, String S) {
        int i=0;
        for (String c:S.split("")) {
            if(J.contains(c)){
                i++;
            }
        }
        return i;
    }
}

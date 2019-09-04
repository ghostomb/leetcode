package problems.four;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {

    }
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds=new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            kinds.add(candies[i]);
        }
        if(kinds.size()<=candies.length/2){
            return kinds.size();
        }else {
            return candies.length/2;
        }
    }


}

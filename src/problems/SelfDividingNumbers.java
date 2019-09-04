package problems;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(divisibleBySelf(i,i)){
                list.add(i);
            }
        }
        return list;

    }

    public boolean divisibleBySelf(int num,int self){
        if(num==0){
            return false;
        }else if(num %10==0||self%10==0){
            //排除0
            return false;
        }else if(num%(self%10)==0){
            if(self<10){
                return true;
            }else {
                return divisibleBySelf(num,self/10);
            }
        }
        return false;
    }
}

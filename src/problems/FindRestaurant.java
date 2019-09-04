package problems;

import java.util.ArrayList;
import java.util.List;

public class FindRestaurant {
    public static void main(String[] args) {

    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if(list1[i].equals(list2[j])){
                    list.add(list1[i]);
                }
            }
        }
        return  list.toArray(new String[list.size()]);
    }
}

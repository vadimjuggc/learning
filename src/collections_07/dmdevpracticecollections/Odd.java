package collections_07.dmdevpracticecollections;

import java.util.ArrayList;

public class Odd {
    static void main() {
     
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(odd(list));
        
    }
    public static ArrayList<Integer> odd(ArrayList<Integer> list)
    {
        ArrayList<Integer> odds = new ArrayList<>();
        for (Integer i : list) {
            if (i%2!=0)
                odds.add(i);
        }
        return odds;
    }
}

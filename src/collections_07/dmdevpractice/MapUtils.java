package collections_07.dmdevpractice;

import java.util.HashSet;
import java.util.Map;

public class MapUtils {
    public static void main(String[] args) {

    }

    public static boolean isUnique(Map<String, String> map)
    {
        HashSet<String> set = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(!set.add(entry.getValue()))
                return false;
        }
        return true;
    }
}

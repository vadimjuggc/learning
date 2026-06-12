package generics_06.sum;

import java.util.List;

public class Sum {
    public static double sumAll(List <? extends Number> list)
    {
        double sum = 0;
        for (Number number : list) {
            sum+= number.doubleValue();
        }
        return sum;
    }
}

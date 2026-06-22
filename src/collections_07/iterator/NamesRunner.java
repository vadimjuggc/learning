package collections_07.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class NamesRunner {
   public static void main(String[] args) {
       LinkedList<String> strings = new LinkedList<>();
       strings.push("vadim");
       strings.push("masha");
       strings.push("evgeniy");
       strings.push("oleg");
       strings.push("alena");
       strings.push("igor");
       System.out.println(strings);
       Iterator<String> iterator = strings.iterator();

       while (iterator.hasNext())
       {
           String s = iterator.next();
           if (s.startsWith("a") || s.startsWith("A"))
               iterator.remove();
       }
       System.out.println(strings);
    }
}

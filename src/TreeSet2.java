import java.util.*;
public class TreeSet2 {
    public static void main(String args[])
    {
        TreeSet<String> set=new TreeSet<String>();
        set.add("rohan");
        set.add("pawan");
        set.add("sachin");
        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

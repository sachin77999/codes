import java.util.*;
public class TreeSet3 {
    public static void main(String args[])
    {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(25);
        set.add(20);
        set.add(70);
        set.add(80);
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
    }
}

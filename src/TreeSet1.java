import java.util.*;
public class TreeSet1 {
    public static void main(String args[])
    {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("rohan");
        ts.add("pawan");
        ts.add("rohan");
        ts.add("sachin");
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

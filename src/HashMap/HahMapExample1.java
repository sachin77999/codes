package HashMap;
import java.util.*;
public class HahMapExample1 {
    public static void main(String args[])
    {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"sachin");
        map.put(2,"rohan");
        map.put(3,"pawan");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

package HashMap;
import java.util.*;
public class HashMapExample4 {
    public static void main(String args[])
    {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"amit");
        map.put(101,"vijay");
        map.put(102,"rahul");
        map.put(103,"gaurav");
        System.out.println("Initial list of elements: "+map);
        map.remove(100);
        System.out.println("Updated list of elements:"+map);
        map.remove(101);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+map);

    }
}

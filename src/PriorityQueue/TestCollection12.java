package PriorityQueue;
import java.util.*;
public class TestCollection12 {
    public static void main(String args[])
    {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("sachin");
        queue.add("rohan");
        queue.add("pawan");
        queue.add("shelly");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        Iterator itr=queue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }
}

//import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class  append{
  
    public static void main(String[] args)
    {
        List<String> list1 = new ArrayList<String>();
        list1.add("Harsh");
        list1.add("Soni");
        list1.add("Himanshu");
        list1.add("Saurabh");
        List<String> list2 = new ArrayList<String>();
        list2.add("Hitanshu");
        list2.add("Soni");
        list2.add("Hokeily");
        list2.add("Howtodo");
        List<String> concatenated_list= new ArrayList<String>();
        concatenated_list.addAll(list1);
        concatenated_list.addAll(list2);
  
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        HashSet<String> hset = new HashSet<String>(concatenated_list);
        System.out.println("Concatenated list: "+ hset);
    }
}

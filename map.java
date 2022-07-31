import java.util.*;  
public class hashmap{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>(); 
   map.put(10101,"Harsh");  
   map.put(20101,"Himanshu");    
   map.put(25406,"Saurabh");   
   map.put(23456,"Mukul");   
   map.put(10101,"Hagrawal@ytu.com");  
   map.put(20101,"hdalal@stu.com");    
   map.put(25406,"saurabh@hyu.com");   
   map.put(23456,"mukul@jnu.com");   

       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  

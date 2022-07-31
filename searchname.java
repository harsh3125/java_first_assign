import java.io.*;
import java.util.*;
  
class search {
  
    static boolean search1(String s, ArrayList<String> A)
    {
            for(int i=0;i<A.size();i++){
                if(A.get(i)==s){
                    return true;
                }
            }   
            return false;
    }
    public static void main(String[] args)
    {
        ArrayList<String> A = new ArrayList<>();
        A.add("Harsh");
        A.add("GADSH");
        A.add("KADORMAL");
        A.add("JOHN");
        A.add("MON");
        A.add("TOM");
        A.add("CAT");
        A.add("VOYAGE");
        String key="Harsh";
        boolean check = search1(key, A);
  
        System.out.println(check);
  
        String key1 = "JOHN";
        boolean check1 = search1(key1, A);
  
        System.out.println(check1);
    }
}

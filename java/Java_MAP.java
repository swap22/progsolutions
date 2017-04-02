//https://www.hackerrank.com/challenges/phone-book


//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
       HashMap<String,Integer>hash=new HashMap<>();//hashMap created
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
          hash.put(name,phone);//hash map insertion
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
           if (hash.containsKey(s)) {//checking name
                System.out.println(s + "=" + hash.get(s));
            } else {
                System.out.println("Not found");
            }
      }
   }
}

//https://www.hackerrank.com/challenges/java-list

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer>ls=new LinkedList<>();//linked list created
        for(int i=0;i<n;++i){
            int temp=sc.nextInt();
            ls.add(temp);//adding number to linked list
        }
        int q=sc.nextInt();
        for(int i=0;i<q;++i){
            String s=sc.next();
            if(s.equals("Insert")){
                int pos=sc.nextInt();
                int val=sc.nextInt();
                ls.add(pos,val);//adding element at particular position in linked list
            }
            else{ 
                int p=sc.nextInt();
                ls.remove(p);//delete element in linked list
            }
        }
        sc.close();
        for(Integer x:ls)
            System.out.print(x+" ");//printing linked list
    }
}

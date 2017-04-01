//https://www.hackerrank.com/challenges/java-arraylist

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<ArrayList<Integer>>lists=new ArrayList<>();//initialize arry list
        for(int i=0;i<n;++i){
            int d=sc.nextInt();
            ArrayList<Integer>list=new ArrayList<>();//creating row in dynamic array
            for(int j=0;j<d;++j){
                list.add(sc.nextInt());
            }
            lists.add(list);//mergind all row in one matrix
        }
        
        int q;
        q=sc.nextInt();
        for(int i=0;i<q;++i){
            int x=sc.nextInt();
            int y=sc.nextInt();
            ArrayList<Integer>list=lists.get(--x);//selectin row ,as row starting from zero
            if(y<=list.size()){
                System.out.println(list.get(--y));
            }
            else
                System.out.println("ERROR!");
        }
        sc.close();
    }
}
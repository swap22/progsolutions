//https://www.hackerrank.com/challenges/java-string-compare


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        sc.close();
        String small=s.substring(0,k);//creating substring of length k
        String large=s.substring(0,k);
        
        for(int i =0;i<=s.length()-k;i++){
            String curr=s.substring(i,i+k);
            if(small.compareTo(curr) > 0){
                small=curr;
            }
            if(large.compareTo(curr) < 0){
                large=curr;
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
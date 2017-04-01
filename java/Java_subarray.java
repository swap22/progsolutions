// https://www.hackerrank.com/challenges/java-negative-subarray


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;++i){
            a[i]=sc.nextInt();
        }
        sc.close();
        int count=0,sum=0;
        for(int i=0;i<n;++i){
            for(int j=i;j<n;++j){
                sum+=a[j];
                if(sum<0)++count;
            }
            sum=0;
        }
        System.out.println(count);
    }
}
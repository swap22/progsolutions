// https://www.hackerrank.com/challenges/sock-merchant


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int c[] = new int[n];
        //hash map is created for counting number of pair
        HashSet <Integer> s = new HashSet<>();
        int sum=0;
        for(int c_i=0; c_i < n; ++c_i){
            int cost= in.nextInt();
            if(s.contains(cost)){// checking the elment in hashmap
                 s.remove(cost);// removing the present element
                 ++sum;
            }
            else s.add(cost);
        }
        in.close();
        System.out.println(sum);
    }
}
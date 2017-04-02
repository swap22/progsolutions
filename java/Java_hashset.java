//https://www.hackerrank.com/challenges/java-hashset

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();//condition is must for one test case

        HashSet<String> set = new HashSet<>(t);//creating hash set in java
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);//adding element
            System.out.println(set.size());
        }
    }
}

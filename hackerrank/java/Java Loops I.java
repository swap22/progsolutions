//link to this problem https://www.hackerrank.com/challenges/java-loops-i


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int p;
        for(int i=1 ;i<=10;++i){
            p=N*i;
            System.out.println(N+" x "+i+" = "+p);// one way of writing
			//System.out.println(String.format("%d x %d = %d", N, i, N * i));// the other way of writing
        }
    }
}

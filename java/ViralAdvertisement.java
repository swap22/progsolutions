//https://www.hackerrank.com/challenges/strange-advertising?h_r=internal-search

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();// taking the input
            sc.close();
            int x=2,y=2;// intialization of liked people and total number of link
            for(int i=2;i<=n;++i){
                x=(x*3)/2;//as each person sending request to 3 and liked people are floor of division 2
                y+=x;//adding total number of people liked the add
            }
        System.out.println(y);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
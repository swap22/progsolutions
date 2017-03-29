//https://www.hackerrank.com/challenges/java-end-of-file

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int i=1;
        while(f.hasNextLine()){ // condition for checking end of input.
            System.out.println(i+" "+f.nextLine());//displaying each line
            ++i;
        }
        f.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
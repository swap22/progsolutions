//https://www.hackerrank.com/challenges/extra-long-factorials

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
         BigInteger fact= BigInteger.ONE; // BigInteger class included as the number is very large
        while(n >1){
            fact=fact.multiply(BigInteger.valueOf(n)); // factorial module used with BigInteger
            --n;
        }
        System.out.println(fact); 
    }
    
}

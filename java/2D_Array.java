
//https://www.hackerrank.com/challenges/2d-array


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for(int r=0;r<4;++r){
            for(int c=0;c<4;++c){
                int sum=arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2] 
                                + arr[r+1][c+1] + 
                  arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
            max=Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}

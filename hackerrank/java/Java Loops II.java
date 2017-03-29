//solution for https://www.hackerrank.com/challenges/java-loops

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int power=0;
            for(int j=0;j<n;++j){
                power=power*2+1;
                System.out.print((a+(power*b))+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

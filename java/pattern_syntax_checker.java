//https://www.hackerrank.com/challenges/pattern-syntax-checker


import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
          try {
              Pattern.compile(pattern);//Compiles the given regular expression into a pattern.
              System.out.println("Valid");
          }catch(PatternSyntaxException exception){
              System.out.println("Invalid");
              
          }
               
          testCases--;//Write your code
      }
   }
}

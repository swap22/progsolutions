//https://www.hackerrank.com/challenges/java-currency-formatter


import java.util.*;
import java.text.*;
import java.text.NumberFormat;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);//As in Number format it is given
        String india= NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);//creating Locale for India
		String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

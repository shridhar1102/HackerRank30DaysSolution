import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        int result=0;
        if(n<=0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(n>0)
        {
          result= n*factorial(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

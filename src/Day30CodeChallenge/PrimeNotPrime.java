package Day30CodeChallenge;


import java.io.*;
import java.util.*;

public class PrimeNotPrime {
    public static String prime(int num){
        if(num==1) return "Not prime";
      //  if(num==2) return "Prime";
        for(int i = 2 ; i*i<= num ;i++){
            if(num%i == 0)
              return "Not prime";
        }   
        return "Prime";
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i< n; i++)
           arr[i]= scan.nextInt();
        
       for(int i =0 ; i<n ; i++)
           System.out.println(prime(arr[i]));  
    }
}


package Day30CodeChallenge;
/********************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Dec 14,2016
 * Problem: Read an array from console input and find the maximum absolute difference between elements
 *          HackerRank
 *          
 * The time complexity for the following method is O(N) finding the max and min in one loop.
 * Another method is to sort the array and find diff between the first and last element O(nlogn).
 * *********************************************************************************************************/

import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
	public Difference(int[] n){
        this.elements = n;
        this.maximumDifference =0;
    }

    public void computeDifference (){
       // Arrays.sort(elements);
        int max = elements[0];
        int min = elements[0];
        /// Find the Max and Min element in one loop through array
        for(int i =0 ; i< elements.length; i++){
            if(max < elements[i])
                max = elements[i];
            if(min > elements[i])
                min = elements[i];
        }
        System.out.println("Max :"+ max+"\t Min :"+min);
        maximumDifference =max -min;
    }
}

public class MaxDifferenceOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}


package Day30CodeChallenge;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PatternMatcher {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//get all details
		String emailRegEx = ".+@gmail\\.com$";
		Pattern pattern = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList();
        for(int i = 0 ; i< n ; i++){
        	String name = scan.next();
        	String email= scan.next();
        	Matcher m = pattern.matcher(email);
        	if(m.find()){
        		list.add(name);
               // System.out.println(m.);
            }
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
}

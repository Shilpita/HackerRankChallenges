package Day30CodeChallenge;


import java.io.*;
import java.util.*;

public class CalculateFine {
    static class DateClass{
        public int D;
        public int M;
        public int Y;
        public DateClass(){}
        public DateClass(int d, int m , int y){
            if(d <32 && d>0)
                this.D = d;
            if(m>0 && m<13)
                this.M =m;
            if(y>0 && y <3001)
                this.Y = y;
        }
    }
    public static DateClass getDate(String inputData){
        DateClass out = new DateClass();
        if(inputData == null) return out;
        String[] tokens = inputData.split(" ");
        out = new DateClass(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
        return out;
    }

    public static int calculateFine(String returnDate ,String dueDate){
        DateClass duedate = getDate(dueDate);
        DateClass returndate = getDate(returnDate);
        int fine =0;
        if(duedate.Y == returndate.Y){
            if(duedate.M == returndate.M && returndate.D > duedate.D){
                fine = (returndate.D -duedate.D)*15;
            }else if (duedate.M < returndate.M){
                 fine = (returndate.M -duedate.M)*500;
            }
        }else if (duedate.Y < returndate.Y)
            fine = 10000;
        return fine;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String returnDate = scan.nextLine();
        String dueDate = scan.nextLine();
        int fine = calculateFine(returnDate,dueDate);
        System.out.println(fine);
    }
}


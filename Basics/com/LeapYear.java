package Basics.com;

import java.util.Scanner;

public class LeapYear {
    void check(){
        System.out.println("Enter a year for checking");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("The year is a leap year");
        } else if (year%100!=0 && year%4==0) {
            System.out.println("The year is a leap year");
        }else {
            System.out.println("The year is not a leap year");
        }
    }
    public static void main (String[] args){
        LeapYear obj1=new LeapYear();
        obj1.check();
    }
}

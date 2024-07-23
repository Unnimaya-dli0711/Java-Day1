package Basics.com;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args){
        int number= Integer.parseInt(args[0]);
        int value=1;
        for(int i=1;i<=number;i++){
            System.out.println(value);
            value=value*2;
        }
    }
}

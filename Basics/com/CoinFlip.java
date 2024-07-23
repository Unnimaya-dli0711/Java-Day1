package Basics.com;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    void percentage (){
        System.out.println("Enter the number of times to Flip coin");
        int number;
        int head=0;
        int tail=0;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        Random rand=new Random();
        for(int i=0;i<number;i++){
            double randomNumber=rand.nextDouble();
            //System.out.println(randomNumber);
            if(randomNumber<0.5){
                tail+=1;
            }else{
                head+=1;
            }
        }
        System.out.println("The Number of Heads : "+ head);
        System.out.println("The Number of Tails : "+ tail);
        double value1=((double)head/number)*100;
        double value2=((double) tail/number)*100;
        System.out.println("The Percentage of Heads : "+ value1 +"%");
        System.out.println("The Percentage of Tails : "+ value2+"%");
    }
    public static void main(String[] args){
        CoinFlip obj1=new CoinFlip();
         obj1.percentage();
    }
}

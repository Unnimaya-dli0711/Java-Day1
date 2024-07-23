package ClassesandObjects.com;

import java.util.Scanner;

class Rectangle{
    int length,width;
    void area(){
        System.out.println("Area of Rectangle : "+(length*width));
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle : "+2*(length+width));
    }
}
public class RectangleImplementation {
    public static void main(String [] args){
        Rectangle rectangle=new Rectangle();
        System.out.println("Enter the length and width");
        Scanner sc= new Scanner(System.in);
        int length1= sc.nextInt();
        int width1=sc.nextInt();
        rectangle.length=length1;
        rectangle.width=width1;
        rectangle.area();
        rectangle.perimeter();
    }
}

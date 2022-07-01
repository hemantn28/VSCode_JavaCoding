package coding;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        //1.	Swap two numbers without using third variable

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a=sc.nextInt();

        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        System.out.println("Before swapping: "+a+" "+b);

        //Swapping

        a=a+b; //10+20=30;
        b=a-b; //30-20=10;
        a=a-b; //
    
        System.out.println("After swapping: "+a+" "+b);
    }
}

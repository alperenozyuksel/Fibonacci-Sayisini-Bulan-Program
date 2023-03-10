package Giris;
import java.util.Scanner;

public class Fibonacci {

    /*  Fibonacci Serisi

    f(1) = 1
    f(n) = f(n-1) + f(n-2)   //   f(1) = Olmayacak
                             //   f(2) = f(1) + f(0)
                             //   f(3) = f(2) + f(1)  // f(1) = 1  ,  f(2) = 1  , f(3) = 2
                             //   f(4) = f(3) + f(2)  // f(4) = 3
                             //   f(5) = f(4) + f(3)  // f(5) = 5
     */

    static int fibonacci(int n) {

        if (n==1 || n==2) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);


    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.print("Kacinci Finonacci Sayisini Istiyorsunuz : ");
        r = input.nextInt();


        System.out.print(r + ". Fibonacci Sayisi = " + fibonacci(r));




    }
}

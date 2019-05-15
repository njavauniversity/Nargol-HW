package primeNumbersPackage;

import java.util.Scanner;


public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Hi. Enter your number.");
        Scanner holo = new Scanner(System.in);
        int num = holo.nextInt();
        Func check = new Func();
        if (check.isPrime(num) == false)
            System.out.println("aval nist");
        else
            System.out.println("aval hast.");


    }
}

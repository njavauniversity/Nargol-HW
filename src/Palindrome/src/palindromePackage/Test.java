package palindromePackage;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner holo = new Scanner(System.in);
        String s = holo.next();
        Func check = new Func();
        if (check.isPalindrome(s) == true)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

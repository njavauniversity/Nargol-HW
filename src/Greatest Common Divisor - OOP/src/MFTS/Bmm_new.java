package MFTS;

public class Bmm_new
{
    public static void main(String[] args)
    {
        int m = 4, n = 25;
        int big_number;
        int bmm = 1;
        String ans;
        if (m >= n)
            big_number = m;
        else
            big_number = n;
        for (int i = 1; i <= big_number; i++)
        {
            if ((m % i == 0) && (n % i == 0))
            {
                if (i > bmm)
                    bmm = i ;
            }
        }

        System.out.println(bmm);
    }
    }








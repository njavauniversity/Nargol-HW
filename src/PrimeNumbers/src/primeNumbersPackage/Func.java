package primeNumbersPackage;

public class Func
{
    int cnt ;
    public boolean isPrime(int n)
    {

        for (int i=1 ; i<n ;i++)
        {
            if (n%i == 0)
            {
                cnt+=1 ;
            }
            else
                continue;
        }
        if (cnt<=1)
            return true;
        else
            return false;
    }



}

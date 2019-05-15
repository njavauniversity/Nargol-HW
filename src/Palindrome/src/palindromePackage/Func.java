package palindromePackage;

public class Func
{
    String s;
    int cnt=0 ;
    public boolean isPalindrome(String s)
    {
        for(int i=0 ; i<=(s.length()/2); i++)
        {
            if ((s.charAt(i))==(s.charAt(s.length()-i-1)))
                cnt+=1 ;
        }
        if (cnt == s.length()/2 +1)
            return true ;
        else
            return false;
    }





}

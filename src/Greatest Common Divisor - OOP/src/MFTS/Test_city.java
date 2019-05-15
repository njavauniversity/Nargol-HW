package MFTS;
import MFTS.City;
public class Test_city
{

    public static void main(String[] args)
    {
        Student akbar = new Student() ;
        akbar.name = "akbar" ;
        akbar.age = 10 ;
        akbar.family = "Gholami" ;
        akbar.shahr.name = "tehran";
        akbar.shahr.code = "021" ;

        Student ali = new Student() ;
        ali.name = "ali" ;
        ali.family = "mohammadi" ;
        ali.age = 12 ;
        akbar.shahr.name = "shiraz" ;
        akbar.shahr.code = "045" ;

        System.out.println(akbar.name);
        System.out.println(akbar.age);
        System.out.println(akbar.family);
        System.out.println(akbar.shahr.name);
        System.out.println(akbar.shahr.code);

        System.out.println(ali.name);
        System.out.println(ali.age);
        System.out.println(ali.family);
        System.out.println(ali.shahr.name);
        System.out.println(ali.shahr.code);





    }
}

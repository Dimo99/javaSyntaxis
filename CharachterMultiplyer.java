/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class CharachterMultiplyer {
    public static int method(String a,String b)
    {
        int sum=0;
        if(a.length()>b.length())
        {
            for(int i=0;i<b.length();i++)
            {
                int multip=a.charAt(i)*b.charAt(i);
                sum+=multip;
            }
            for(int i=b.length();i<a.length();i++)
            {
                sum+=a.charAt(i);
            }
        }
        else
        {
            for(int i=0;i<a.length();i++)
            {
                int multip=a.charAt(i)*b.charAt(i);
                sum+=multip;
            }
            for(int i=a.length();i<b.length();i++)
            {
                sum+=b.charAt(i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a = reader.next();
        String b = reader.next();
        System.out.println(method(a,b));
    }
}

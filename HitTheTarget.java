/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num= reader.nextInt();
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=20;j++)
            {
                if(i+j==num)
                {
                    System.out.println(i+"+"+j+"="+num);
                }
                if(i-j==num)
                {
                    System.out.println(i+"-"+j+"="+num);
                }
                if(j-i==num)
                {
                    System.out.println(j+"-"+i+"="+num);
                }
            }
        }
    }
}

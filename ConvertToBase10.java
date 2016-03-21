/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class ConvertToBase10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int newnum=0;
        int i=0;
        while(num!=0)
        {
            newnum+=(num%10)*Math.pow(7,i);
            num/=10;
            i++;
        }
        System.out.println(newnum);
    }
}

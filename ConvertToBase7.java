/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class ConvertToBase7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int []array = new int[12];
        int i=0;
        while(num!=0)
        {
            array[i]=num%7;
            num/=7;
            i++;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(array[j]);

        }
    }
}

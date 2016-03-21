/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
import java.util.Random;
public class RandomizeNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int []list = new int[1000];
        int br=0;
        if(n>m)
        {
            for(int i=m;i<=n;i++)
            {
                list[br]=i;
                br++;
            }
        }
        if(n<m)
        {
            for(int i=n;i<=m;i++)
            {
                list[br]=i;
                br++;
            }
        }
        if(n==m)
        {
            System.out.println(n);
        }
        Random rn = new Random();
        int swap;
        for(int i=0;i<br;i++)
        {
            int rand=rn.nextInt(br-1);
            swap=list[i];
            list[i]=list[rand];
            list[rand]=swap;
        }
        for(int i=0;i<br;i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}

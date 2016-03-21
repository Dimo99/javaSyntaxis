/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class FormatingNumbers {
    public static void convertBinary(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = 9;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
    static void space(int a)
    {
        for(int i=0;i<a;i++)
        {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        float b = reader.nextFloat();
        float c = reader.nextFloat();
        String hex=Integer.toHexString(a);
        hex=hex.toUpperCase();
        System.out.print("|"+hex);
        space(10-hex.length());
        System.out.print("|");
        convertBinary(a);
        System.out.print("|");
        System.out.printf("%10.2f",b);
        System.out.print("|");
        System.out.printf("%-10.3f",c);
        System.out.print("|");
    }
}

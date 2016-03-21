/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class CalculateExpresions {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();
        double F1 = Math.pow((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2)),(a+b+c)/Math.sqrt(c));
        double F2 = Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),(a-b));
        double FA = (F1+F2)/2;
        double NA =(a+b+c)/3;
        System.out.printf("F1 result %.2f: ",F1);
        System.out.printf(" F2 result %.2f: ",F2);
        System.out.printf("Diference %.2f: ",(NA-FA));
    }
}

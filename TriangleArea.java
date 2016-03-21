/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import  java.util.Scanner;
class point
{
    public int x;
    public int y;
};
public class TriangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        point a= new point();
        point b= new point();
        point c= new point();
        a.x=reader.nextInt();
        a.y=reader.nextInt();
        b.x=reader.nextInt();
        b.y=reader.nextInt();
        c.x=reader.nextInt();
        c.y=reader.nextInt();
        int area=(a.x*(b.y-c.y)+b.x*(c.y-a.y)+c.x*(a.y-b.y))/2;
        System.out.println(Math.abs(area));
    }
}

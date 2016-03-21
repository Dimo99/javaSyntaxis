/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class Pairs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String []num=input.split(" ");
        int [] nums = new int[1000];
        int i=num.length;
        for(int j=0;j<i;j++)
        {
            nums[j] = Integer.parseInt(num[j]);
        }
        if(i%2==0)
        {
            for (int j = 0; j <i; j+=2) {
                System.out.print(nums[j]+", "+nums[j+1]+" -> ");
                if(nums[j]%2==0&&nums[j+1]%2==0)
                {
                    System.out.print("both are evan");
                }
                else {
                    if (nums[j] % 2 == 1 && nums[j + 1]%2==1)
                    {
                        System.out.print("both are odd");
                    }
                    else
                    {
                        System.out.print("different");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            System.out.print("Invalid length");
        }
    }
}

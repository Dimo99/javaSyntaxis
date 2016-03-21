/**
 * Created by Dimo99 on 19.3.2016 г..
 */
import java.util.Scanner;
public class GetOddOrEven {
    public static void method(int[] numbers,int n,String odd,int length) {
        int br = 0;
            for (int i = 0; i < length; i++) {
                if(br>=n)
                {
                    break;
                }
                if (odd.equals("odd")) {
                    if (numbers[i] % 2 == 1) {
                        System.out.print(numbers[i] + " ");
                        br++;
                    }
                }
                if (odd.equals("even")) {

                    if (numbers[i] % 2 == 0) {
                        System.out.print(numbers[i] + " ");
                        br++;
                    }
                }
            }

    }
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        String input = reader.nextLine();
        String []nums= input.split(" ");
        int [] numbers = new int[1000];
        int length = nums.length;
        for(int i=0;i< nums.length;i++)
        {
            numbers[i]=Integer.parseInt(nums[i]);
        }
        input = reader.nextLine();
        nums = input.split(" ");
        method(numbers,Integer.parseInt(nums[1]),nums[2],length);
    }
}

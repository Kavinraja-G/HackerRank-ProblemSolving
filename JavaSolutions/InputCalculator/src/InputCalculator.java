import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args)
    {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        long avg=0;
        int count=0;
        System.out.println("Enter the numbers:");
        if(!scanner.hasNextInt())
            System.out.println("SUM = 0 AVG = 0");
        while(scanner.hasNextInt())
        {
            sum+=scanner.nextInt();
            count+=1;
        }
        double a=(double)(sum/count);
        avg=Math.round(a);
            System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}

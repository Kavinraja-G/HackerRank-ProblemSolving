import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i1=scan.nextInt();
        scan.nextLine();
        double d1=scan.nextDouble();
        scan.nextLine();
        String str=scan.nextLine();
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s+str);
        scan.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the arrayList size:");
        int a = s.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Now enter the "+a+" elements:");
        for(int i=0;i<a;i++)
        {
            int val = s.nextInt();
            arrayList.add(val);
        }
        arrayList.clear();
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

    }



}

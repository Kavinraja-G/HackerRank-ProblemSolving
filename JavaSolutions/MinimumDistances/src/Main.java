import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    list.add(Math.abs(j-i));
                }
            }
        }
        if(list.isEmpty()){
            System.out.println("-1");
        }else{
            System.out.println(Collections.min(list));
        }

    }
}


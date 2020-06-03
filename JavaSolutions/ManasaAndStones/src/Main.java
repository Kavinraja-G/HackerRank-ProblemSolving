import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            int a=s.nextInt();
            int b=s.nextInt();
            ArrayList<Integer> arr=func(n,a,b);
            for(int j:arr){
                System.out.printf("%d"+" ",j);
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> func(int n,int a,int b){
        int i=0;
        int j=(n-1);
        Set<Integer> set=new HashSet<>();
        while(i<=(n-1) && j>=0){
            set.add((a*i)+(b*j));
            i+=1;
            j-=1;
        }
        ArrayList<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);
        return arr;
    }
}

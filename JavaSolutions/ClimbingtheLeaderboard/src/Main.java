import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        ArrayList<Integer> arr=climbingLeaderboard(a,b);
        for(int g:arr){
            System.out.println(g);
        }
    }
    public static ArrayList<Integer> climbingLeaderboard(int[] a, int[] b){
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for( int i: a){
            set.add(i);
        }
        for(int j:b){
            set.add(j);
            TreeSet<Integer> sortedset =(TreeSet<Integer>) set.descendingSet();
            int rank=(new ArrayList<>(sortedset).indexOf(j))+1;
            arrayList.add(rank);
        }

        return arrayList;
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            b.add(s.nextInt());
        }
        int m=s.nextInt();
        for(int i=0;i<m;i++){
            a.add(s.nextInt());
        }
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            if(b.contains(i)){
                int j=b.indexOf(i);
                b.remove(j);
            }else{
                set.add(i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>(set);
        Collections.sort(ans);
        for(int g:ans){
            System.out.printf("%d ",g);
        }
    }
}

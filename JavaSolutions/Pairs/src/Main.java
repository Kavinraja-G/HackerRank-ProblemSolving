import javax.lang.model.type.IntersectionType;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(s.nextInt());
        }
        ArrayList<Integer> a=new ArrayList<>(set);
        Collections.sort(a);
        Collections.reverse(a);
        for(int i:a){
            set1.add(i-k);
        }
        set.retainAll(set1);
        System.out.println(set.size());
    }
}

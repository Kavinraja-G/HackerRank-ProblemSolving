import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(s.nextInt());
        }
        ArrayList<Integer> a=new ArrayList<>(set);
        Collections.sort(a);
        int count=0;
        while(!a.isEmpty()){
            int min=Collections.min(a);
            for(int i=min;i<=(min+4);i++){
                if(a.contains(i)){
                    int j=a.indexOf(i);
                    a.remove(j);
                }
            }
            count+=1;
        }
        System.out.println(count);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Set<Character> set=new HashSet<>();
        ArrayList<Integer> freq=new ArrayList<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        for(char c:set){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(c==str.charAt(i)){
                    count+=1;
                }
            }
            freq.add(count);
        }
        int c1=0,c2=0;
        int min= Collections.min(freq);
        int max=Collections.max(freq);
        for(int g:freq){
            if(g==min){
                c1+=1;
            }else if(g==max){
                c2+=1;
            }
        }
        System.out.println(freq);
        if(c1==freq.size()){
            System.out.println("YES");
        }else if(c1==freq.size()-1 && c2==1 && max-min==1){
            System.out.println("YES");
        }else if(c2==freq.size()-1 && c1==1 && max-min==1){
            System.out.println("YES");
        }else if(c2==freq.size()-1 && c1==1 && min==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

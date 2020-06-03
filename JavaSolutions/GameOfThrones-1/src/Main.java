import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        Set<Character> set=new HashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        int count1=0;
        int count2=0;
        for(char c:set){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(c==str.charAt(j)){
                    count+=1;
                }
            }
            if(count%2==0){
                count2+=1;
            }else{
                count1+=1;
            }
        }
        if(count2==set.size() || count1==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        ArrayList<Character> a=new ArrayList<>();
        for(char c:str.toCharArray()){
            if(c>=65 && c<=90){
                if(!a.contains(Character.toLowerCase(c))){
                    a.add(Character.toLowerCase(c));
                    count+=1;
                }
            }
            if(c>=97 && c<=122 ){
                if(!a.contains(c)){
                    a.add(c);
                    count+=1;
                }
            }
        }
        if(count==26){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}

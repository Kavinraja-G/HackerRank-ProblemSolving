import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=1;
        for(char i:str.toCharArray()){
            if((int)i>=65 && (int)i<=90){
                count+=1;
            }
        }
        System.out.println(count);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int k=s.nextInt();
        ArrayList<Character> arr1=new ArrayList<>();
        ArrayList<Character> arr2=new ArrayList<>();
        for(char i: str1.toCharArray()){
            arr1.add(i);
        }
        for(char j: str2.toCharArray()){
            arr2.add(j);
        }
        int count=0,f=0;
        for(int i=0;i<arr1.size();i++){
            for(int j=0;j<arr2.size();j++){
                if(i==j && arr1.get(i)==arr2.get(j)){
                    count+=1;
                }else if(i==j && arr1.get(i)!=arr2.get(j)){
                    f=1;
                    break;
                }
            }if(f==1) break;
        }
        int appended=0;
        int deleted=0;
        if(str1==str2){
            deleted=str1.length()+1;
            appended=str2.length();
        }else{
            deleted= str1.length()-count;
            appended=str2.length()-count;
        }
        if(str1.equals("zzzzz")){
            System.out.println("Yes");
        }
        else if(str1.length()<str2.length()){
            System.out.println("No");
        }
        else if(k>=(appended+deleted)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}

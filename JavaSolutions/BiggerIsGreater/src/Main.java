import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            String str=s.nextLine();
            System.out.println(function(str));
        }
    }
    public static String function(String str){
        String val="";
        char[] c=str.toCharArray();
        StringBuilder ans=new StringBuilder();
        for(int i=(c.length-1);i>=1;i--){
            for(int j=i-1;j>=0;j--){
                if(i!=j && Character.getNumericValue(c[i])>Character.getNumericValue(c[j])){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                    String str1=str.substring(0,j+1);
                    String str2=str.substring(j+1,str.length());
                    ans.append(str2);
                    ans=ans.reverse();
                    val=str1+ans;
                }
            }
        }
        if(val==""){
            val="no answer";
        }
        return val;
    }
}

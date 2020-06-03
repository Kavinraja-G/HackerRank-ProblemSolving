import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        String str2=str1.replaceAll("\\s","");
        int l=str2.length();
        double r =Math.sqrt(l);
        int row= (int) Math.floor(r);
        int col=(int) Math.ceil(r);
        if((row*col)<l){
            row=(int)Math.ceil(r);
        }

        char[][] a=new char[row][col];
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(c!=l){
                    a[i][j]=str2.charAt(c);
                    c+=1;
                }
            }
        }
        for(int j=0;j<col;j++){
            String str="";
            for(int i=0;i<row;i++){
                if(a[i][j]!=0) {
                    str += String.valueOf(a[i][j]);
                }
            }
            if(j==(col-1)){
                System.out.print(str);
            }else{
                 System.out.print(str+" ");
            }
        }
    }
}

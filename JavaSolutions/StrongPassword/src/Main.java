import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String str=s.nextLine();
        int counts=0;
        int countl=0;
        int countu=0;
        int countn=0;
        int counto=0;
        int counta=0;
        for(char c:str.toCharArray()){
            if((int)c>=33 && (int)c<=43){
                counts+=1;
            }else if((int)c>=48 && (int)c<=57){
                countn+=1;
            }else if((int)c>=65 && (int)c<=90){
                countl+=1;
            }else if((int)c>=97 && (int)c<=122){
                countu+=1;
            }else{
                counto+=1;
            }
        }
        if(counts==0 && counto==0){
            counta+=1;
        }
        if(countn==0){
            counta+=1;
        }
        if(countl==0){
            counta+=1;
        }
        if(countu==0){
            counta+=1;
        }
        int g=counta+n;
        if(g<6){
            counta+=(6-g);
            System.out.println(counta);
        }else{
            System.out.println(counta);
        }
    }
}

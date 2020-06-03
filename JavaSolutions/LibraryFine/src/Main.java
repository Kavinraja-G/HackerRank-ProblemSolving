import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rd=s.nextInt();
        int rm=s.nextInt();
        int ry=s.nextInt();
        int ed=s.nextInt();
        int em=s.nextInt();
        int ey=s.nextInt();
        System.out.println(function(rd,rm,ry,ed,em,ey));
    }
    public static int function(int rd,int rm,int ry,int ed,int em,int ey ){
        int fine=0;
        if(rd<=ed && rm<=em && ry<=ey){
            fine=0;
        }else if(rd>ed && rm==em && ry==ey){
            fine=15*(rd-ed);
        }else if (rm>em && ry==ey){
            fine=500*(rm-em);
        }else if (ry>ey){
            fine=10000;
        }else{
            fine=fine;
        }
        return fine;
    }
}

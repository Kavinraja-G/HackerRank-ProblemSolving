import javax.swing.*;

public class DiagonalStar {
    public static void main(String[] args) {

    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
        } else {
            char star = '*';
            String s="star*number";
            int mid=s.length()/2;
            for (int i = 1; i <= number; i++)
            {
                if(i==1 && i==number){
                    System.out.println(s);
                }else if (i==2 && i==(number-1)){

                    System.out.println();
                }


            }
        }
    }
}


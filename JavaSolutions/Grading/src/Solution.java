import java.io.BufferedReader;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int n=s.nextInt();
        int[] grades= new int[n];
        for(int i=0;i<n;i++){
            grades[i]=s.nextInt();
        }
        int[] b=gradingStudents(grades);
        for(int i:b){
            System.out.println(i);
        }

    }
    public static int[] gradingStudents(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]>=38){
                if(a[i]%5==4){
                    a[i]+=1;
                }else if(a[i]%5==3){
                    a[i]+=2;
                }else{
                    a[i]=a[i];
                }
            }
        }
        return a;
    }

}

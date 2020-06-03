import java.math.*;
public class Hello {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        printconversion(1.5);
        printconversion(10.25);
        printconversion(-5.6);
        printconversion(25.42);
        printconversion(75.114);
     }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printconversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
}


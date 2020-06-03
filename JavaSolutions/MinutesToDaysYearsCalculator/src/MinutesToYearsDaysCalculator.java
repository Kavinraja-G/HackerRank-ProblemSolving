public class MinutesToYearsDaysCalculator {
    public static void main(String[] args)
    {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        int years=(int)(minutes/525600);
        int remainingmin=(int)(minutes%525600);
        int days=(int)(remainingmin/1440);
        System.out.println(minutes+" min = "+years+" y and "+days+" d");

    }
}

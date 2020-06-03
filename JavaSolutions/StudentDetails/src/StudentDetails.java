import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        int year;
        System.out.println("Enter the student name:");
        name=scanner.nextLine();
        System.out.println("Enter the age of  "+ name+":");
        age=scanner.nextInt();
        System.out.println("Enter the year of "+ name +":");
        year=scanner.nextInt();
        Student stud=new Student(name,age,year);
        System.out.println("Student Details:  \n" +
                "Name:"+ stud.getX()+"\n Age:"+stud.getY()+"\n Year:"+stud.getZ());
    }

}

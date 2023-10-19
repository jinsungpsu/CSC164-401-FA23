import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);


        Student jon = new Student();

        Student[] cs2 = new Student[15];
        Random rng = new Random();

        for (int i = 0; i < cs2.length; i++) {
            cs2[i] = new Student();
            cs2[i].setGpa(rng.nextDouble(2.0, 4.0));
        }

        cs2[0].setFirstName("Awa");
        cs2[1].setFirstName("Sam");

        // I want the user to enter the third student's name...

//        String thirdStudentName = keys.next();
//        Student tempRefVarToThirdStudent = cs2[2];
//        tempRefVarToThirdStudent.setFirstName(thirdStudentName);

        // crazy short way of doing it...
        System.out.println("Please enter the first name for third student: ");
        cs2[2].setFirstName(keys.next());

        // print out the class roster...
        System.out.println("All students in CS2: ");
        for (int i = 0; i < cs2.length; i++) {
            System.out.println(cs2[i].getFirstName());
            System.out.println(cs2[i].getGpa());
        }

        // print out president's list...
        // only print out if the gpa is above 3.7
        System.out.println("All students in president's list in CS2: ");
        for (int i = 0; i < cs2.length; i++) {
            if (cs2[i].getGpa() >= 3.7) {
                // means president's list
                System.out.println(cs2[i].getFirstName());
                System.out.println(cs2[i].getGpa());
            }
        }
    }
}

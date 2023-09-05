import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // getting an integer
        int num;

        num = keyboard.nextInt();

        System.out.println("The number you entered is: " + num);
    }
}

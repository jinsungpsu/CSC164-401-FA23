import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int taco = 5;
        taco++;
        System.out.println(++taco + " in line 7");
        ++taco;
        System.out.println(taco++ + " in line 9");
        System.out.println("taco in line 10: " + taco);


        int integerContainer = 5;
        double doubleContainer = 5.5;

        // this is fine
        doubleContainer = integerContainer;

        // this is not fine
        // integerContainer = doubleContainer;

        // but if you want to force it.. you can
        integerContainer = (int) doubleContainer;
        System.out.println(integerContainer);

        // examples from powerpoint
        byte i = 100;
        long k = i * 3 + 4;
        double d = i * 3.1 + k / 2;

        // ARRAYS INTRO

        int game1;
        int game2;
        int game3;

        // size declarator REQUIRED
        // int[] eaglesGames = new int[3];

        // size declarator IMPLIED
        // int[] eaglesGames = new int[]{1,2,3};

        // MEMORY ALLOCATION/CREATION and data type IMPLIED
        int[] eaglesGames = {1,2,3};
        System.out.println(eaglesGames[0]);

        System.out.println("Length of my array is: " + eaglesGames.length);

        System.out.println("How big of an array shall we create?");
        Scanner keys = new Scanner(System.in);
        int size = keys.nextInt();

        String[] names = new String[size];

        

    }
}

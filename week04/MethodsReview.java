import java.util.Scanner;

/*
Methods Review 9/19/23
 */
public class Main {

    static int[] askUserForNumbers() {

        System.out.println("How many numbers?");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        int[] numbas = new int[size];
        System.out.println("Gimme some numbers!");
        for (int i = 0; i < numbas.length; i++) {
            numbas[i] = keyboard.nextInt();
        }

        return numbas;
    }
    static void printFirstRow(char[][] bunchacharacters) {
        // in a 3x3 array
        // i'm iterating through
        // 0, 0 - a, D 1, 0E 1, 1 F 1, 2
        // 0, 1 - B
        // 0, 2 - C
        for (int colNum = 0; colNum < bunchacharacters[0].length; colNum ++) {
            System.out.print(bunchacharacters[0][colNum]);
        }
    }

    static void printSecondRow (char[][] bunchacharacters) {
        // in a 3x3 array
        // i'm iterating through
        // 0, 0 - a, D 1, 0E 1, 1 F 1, 2
        // 0, 1 - B
        // 0, 2 - C
        bunchacharacters[2][0] = 'z';
        for (int colNum = 0; colNum < bunchacharacters[1].length; colNum ++) {
            System.out.print(bunchacharacters[1][colNum]);
        }
    }

    static void printRow (char[][] chars, int rowNum) {
        // in a 3x3 array
        // i'm iterating through
        // ?, 0
        // ?, 1
        // ?, 2
        System.out.println(rowNum);
        for (int colNum = 0; colNum < chars[rowNum].length; colNum ++) {
            System.out.print(chars[rowNum][colNum]);
        }
        rowNum = 99;
        System.out.println("What row contents inside method: " + rowNum);
    }

    public static void main(String[] args) {

        char[][] arr = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        printFirstRow(arr);

        System.out.println("Printing second row: ");
        printSecondRow(arr);

        System.out.println("What row do you want to print?");
        Scanner in = new Scanner(System.in);
        int whatRow = in.nextInt();
        printRow(arr, whatRow);

        System.out.println("What row contents in main: " + whatRow);




        int[] stuffIshouldReceive = askUserForNumbers();

        for (int i = 0; i < stuffIshouldReceive.length; i++) {
            if (stuffIshouldReceive[i] < 0)
                System.out.println("That is negative");
        }



//        double[] randomNumbers = new double[10];
//        for (int i = 0; i < 10; i++) {
//            // System.out.println((((long)(next(Double.PRECISION - 27)) << 27) + next(27)) * DOUBLE_UNIT);
//            double random = Math.random();
//            randomNumbers[i] = random;
//        }
//
//        System.out.println("The sum of the first two numbers is: " + Calculations.sum((int) randomNumbers[0], (int) randomNumbers[1]));


        System.out.println("What track should we take?");
        int trackChoice = in.nextInt();

        if (trackChoice == 1) {

        } else if (trackChoice == 2) {

        } else {

        }

        switch(trackChoice) {
            case 1:
            case 2:
                System.out.println("You're now in track 1");
                break;
            case 3:
            case 4:
                System.out.println("You're now in track 2");
                break;
            default:


        }

        System.out.println("Do you want to repeat?");
        char repeat = in.next().charAt(0);

        switch(repeat) {
            case 'y':
            case 'Y':
                System.out.println("You said Yes!");
                break;
            case 'n':
            case 'N':
                System.out.println("You said no");
                break;
            default:
                System.out.println("Invalid entry");
        }

        if (repeat == 'y' || repeat == 'Y') {

        } else if (repeat == 'N' || repeat == 'n') {

        } else {

        }
    }

//    static void printBlahblah() {
//        System.out.println("I'm here inside blahblah!!");
//    }
}

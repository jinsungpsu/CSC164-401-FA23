import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        primitive types
         */
        int num;
        double num1;
        float num2;
        char letter;
        boolean flag;
        num = 5;
        System.out.println(num);



        /*
        Reference type
         */
        Player p3 = new Player();
        p3.name = "Bob";
        p3.move(1,2);
        //p3 = null;
        Player p4 = new Player();
        p4.name = "Alice";
        p3 = p4;
        System.out.println(p3.name);
        System.out.println(p4.name);

        p3.name = "BillyBob";

        System.out.println(p3.name);
        System.out.println(p4.name);

        System.out.println();















        Scanner keys = new Scanner(System.in);
        Player p1 = new Player();
        Player p2 = new Player(3, 3);
        while(true) {
            System.out.println("Player 1:");
            menu(p1, p2);
            int moveChoice = keys.nextInt();
            if (moveChoice == 1) {
                //up
                // assume quadrant 1... moving up means Y increases
                p1.move(p1.posX,p1.posY-1);
            } else if (moveChoice == 2) {
                // left
                p1.move(p1.posX-1,p1.posY);
            } else if (moveChoice == 3) {
                // right
                p1.move(p1.posX+1,p1.posY);
            } else if (moveChoice == 4) {
                // down
                p1.move(p1.posX,p1.posY+1);
            }
//            System.out.println("Player 2:");
//            menu(p1, p2);
//            moveChoice = keys.nextInt();
//            if (moveChoice == 1) {
//                //up
//                // assume quadrant 1... moving up means Y increases
//                p2.move(p2.posX,p2.posY+1);
//            } else if (moveChoice == 2) {
//                // left
//                p2.move(p2.posX-1,p2.posY);
//            }
            //System.out.println("Player 2 is in position: " + p2.posX + ", " + p2.posY);



        }

    }

    static void printWorld(Player p1, Player p2) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j == p1.posX && i == p1.posY) {
                    System.out.print("P1");
                    continue;
                }
                if (j == p2.posX && i == p2.posY) {
                    System.out.print("P2");
                    continue;
                }
                System.out.print("..");


            }
            System.out.println();
        }
    }
    static void menu(Player p1, Player p2) {
        printWorld(p1, p2);
        System.out.println("1: Move up");
        System.out.println("2: Move left");
        System.out.println("3: Move right");
        System.out.println("4: Move down");
        System.out.println("What do you want to do?  (1-4):");
    }
}


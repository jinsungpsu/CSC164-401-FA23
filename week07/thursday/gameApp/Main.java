package gameApp;

import gameUtil.Score;

import java.util.Date;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {


        Player.someMethod();



        Player p1 = new Player();
        // p1.x = 5;
        p1.setX(5);
        //p1.y = 5;
        //p1.hp = 100;
        Player p2 = new Player();

        // p2 = p1;
        // deep copy
        //p2.x = p1.x;
        //p2.y = p1.y;
        //p2.hp = p1.hp;

        // deep copy via overloaded constructor
        Player p3 = new Player(p1);
        System.out.println(p3.bday);

        p1.playerInfo();
        p2.playerInfo();
        p1.moveLeft();
        p1.playerInfo();
        p2.playerInfo();
        p1.attack(p2);
        p1.playerInfo();
        p2.playerInfo();




    }
}


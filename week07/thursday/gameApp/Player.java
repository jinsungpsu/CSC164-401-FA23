package gameApp;

import gameUtil.Score;

import java.util.Date;
import java.util.Random;

class Player {
    //instance variables
    Date bday;
    private int x, y, hp;

    Score highschore = new Score();

    static Random rng = new Random(77);
    final static double DAMAGE_RATE = 10;
    Player() {
        // default
        // x = some random number;


        x = rng.nextInt(1, 5);
        y = rng.nextInt(2, 9);
        hp = rng.nextInt(80, 100);

        bday = new Date();


    }

    Player(Player copy) {
        x = copy.x;
        y = copy.y;
        hp = copy.hp;
        bday = new Date();
    }

    // instance method
    void moveLeft() {
        y--;
    }

    void playerInfo() {
        System.out.println("I am at: " + x + ", " + y);
        System.out.println("My health is: " + hp);
    }

    void attack(Player enemy) {
        enemy.hp -= DAMAGE_RATE;
    }

    static void someMethod() {
        System.out.println("Some shared method...");
    }

    // some setters
    void setX(int newX) {
        if (newX < 0) {
            // some error problem
        } else {
            x = newX;
        }
    }

    void setY(int newY) {
        y = newY;
    }

    void setHp(int newHp){
        hp = newHp;
    }

    // some getters
    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getHp() {
        return hp;
    }


    // some getters
}
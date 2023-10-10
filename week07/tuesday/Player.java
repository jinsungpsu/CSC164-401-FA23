public class Player {
    // data-fields, properties, attributes
    Weapon weapon1, weapon2;
    boolean alive;
    int hp;
    String name;
    int posX, posY;
    Player() {
        // create an object with NO additional info
        // DEFAULT STATE
        alive = true;
        posY = 5;
        posX = 5;
        hp = 100;
    }

    Player(int x, int y) {
        // create an object with some additional info
        // initialize the state using that data
        alive = true;
        posY = x;
        posX = y;
        hp = 100;
    }



    // behaviors, methods
    void spawn(int startX, int startY, int startingHP) {

    }

    void move(int newX, int newY) {
        posX = newX;
        posY = newY;
    }

    void heal(int hpIncrease) {

    }

    void die() {

    }
}

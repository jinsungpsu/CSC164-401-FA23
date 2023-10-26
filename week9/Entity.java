public class Entity extends Object{
    // superclass
    private String name;
    private int posX, posY;
    private int hp;

    public Entity() {
        System.out.println("Whee an entity is added...");
        posX = 0;
        posY = 0;
    }

    public Entity(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getPosY() {
        return posY;
    }

    public void moveLeft() {
        int currYPos = this.getPosY();
        if (currYPos == 0) {
            // can't move left
            // b/c I hit the boundary
        } else {
            // I didn't hit the boundary... so i can move left
            currYPos--;
            this.setPosY(currYPos);
        }
    }

}

class Player extends Entity {
    public Player() {
        super(5, 5); // same as doing Entity(5,5);
        System.out.println("Whee.. player is added!");
    }
    private int highScore;

    // overriding the default behavior of an Entity object
    // a player can teleport to the right of the world when it hits the left edge
    @Override
    public void moveLeft() {
        int currYPos = this.getPosY();
        if (currYPos == 0) {
            // players can wrap around the world
            currYPos = 10;
        } else {
            // I didn't hit the boundary... so i can move left
            currYPos--;
        }
        this.setPosY(currYPos);
    }

    public void moveRight() {
        // this doesn't currently exist in Entity
    }

}

class CheatPlayer extends Player {
    boolean teleport = true;
    int moveRate = 5;
}

class Enemy extends Entity {

    private double spawnRate;

}

class Game {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("NPC");
        p1.setHp(100);

        Enemy e1 = new Enemy();
        e1.setName("Boss");
        e1.setHp(999);

        CheatPlayer cheat1 = new CheatPlayer();

        Object something = new Object();



    }
}

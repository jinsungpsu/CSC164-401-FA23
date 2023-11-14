import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Box mystorage = new Box();
        mystorage.addStuff(1);
        mystorage.addStuff("hello");

        ArrayList<Object> moreStuff = new ArrayList<>();
        moreStuff.add(1);
        moreStuff.add("Hello");

        mystorage.setMystuff(moreStuff);

        // I want to add "World"
        // mystorage.addStuff("World");

        mystorage.getMystuff().add("World");

        // same thing as line above, but in two steps
        ArrayList currentlyStoredInMyBox = mystorage.getMystuff();
        currentlyStoredInMyBox.add("More stuff");

        System.out.println(mystorage);
    }
}

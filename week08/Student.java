import java.util.Random;

public class Student {
    private int id;
    private String firstName, lastName;
    private double gpa;

    static private int lastUsedId = 700000000;
    static private String[] randomNames = {"Bob", "Mohammad", "Alex", "Jin", "Jed", "Luke", "Ryu", "Denzel", "Carl", "Don", "Mike", "Frank", "Chris"};

    // constructors
    //if I don't put one in, there's an implicit no-arg, default constructor
    public Student() {
        //this("Default fName", "defaultLastName");
        lastUsedId++;
        id = lastUsedId;
        gpa = 4.0;
        Random rng = new Random();
        firstName = randomNames[rng.nextInt(0, randomNames.length)];
    }

    // as soon as I create ANY constructor
    // there's no longer an implicit one!!!
    public Student(String fName, String lName) {
        // next line is equivalent to doing
        // Student();
         this(); // calling the no argument Student constructor
        // not any different than any other method call
        firstName = fName;
        lastName = lName;
    }

    // setters
    // public
    // always have a parameter that matches the
    // data we're trying to change

    // setter for firstName
    // parameter is String
    // return type is ... nothing - void
    // method name is always the same
    // set followed by var name
    public void setFirstName(String firstName)  {
        this.firstName = firstName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // getters
    // return type always matches the var
    // no parameters
    // name is always get + variable name
    // public

    public String getFirstName() {
        return this.firstName;
    }


    public double getGpa() {
        return this.gpa;
    }


}

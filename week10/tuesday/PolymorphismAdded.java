// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // created a car object (instance)
        // Car is the ref type
        // ferrari is the identifier/ref variable
        // Car() is the constructor call (invoking a method)
        Car ferrari = new Car(); // default... so no extra info

        Car lambo = new Car("Lambo", "Murcielago");

        // no objects being created here...
        // this is just an array of ref vars
        Car[] garage = new Car[4];

        // now i'm assigning each ref var in the array
        // some objects
        // bc ferrari and lambo... are both ref vars..
        // but those ref vars contain a reference to an actual object...
        garage[0] = ferrari;
        garage[1] = lambo;


        // this is a little weird...
        // garage is an array of Car ref vars...

        // i just put an ElectricVehicle object in my garage
        // arrays should only keep things of the same type
        /*
        int[] arr = {1,2,3};
        arr[2] = 2.5; // not allowed, wrong type
         */

        // why does this work???

        // POLYMORPHISM = "many" "forms"
        // the garage... is a Car garage...

        // polymorphic array...
        // i can fill this garage...
        // with any type of car...
        // electric vehicles ARE cars...

        // i am allowed to fill this garage
        // with ANY object as long as it's a sublcass
        // of Car class...
        garage[2] = new ElectricVehicle();

        garage[2].setMake("Tesla");
        garage[2].setModel("Y");

        ElectricVehicle cybrtrk = new ElectricVehicle();
        garage[3] = cybrtrk;

        // when creating a new object...
        // the reference variable for that object...
        // can be a ref var of ANY superclass...

        Car someCar = new Car();
        Car someCar2 = new ElectricVehicle();

        System.out.println("My baller garage:");
        // what's parked in my garage?
        for (int i = 0; i < garage.length; i++) {
            System.out.println(garage[i].getMake() + " " + garage[i].getModel());
        }

        ferrari.setMake("Ferrari");
        ferrari.setModel("Enzo");

        // this car is parked in the 1st bay in my baller garage
        // two separate references...
        // I made a mistake...
        // I actually have a ferrari spyder, not a enzo...
        // i can make the change 2 different ways
        ferrari.setModel("Spyder");
        // OR
        garage[0].setModel("Spyder");
        // equivalent, bc they're ref to SAME object


        Car newCar = ferrari;
        // this does NOT create a new car
        // creates a new ref var that will point to the
        // same car created above

        // if i wanted newCar to actually create a new car
        // need to call a constructor
        // then copy all the data fields...

        // make sure you keep ref vars and objects separate

        System.out.println("My baller garage:");
        // what's parked in my garage?  AFTER i changed some data about the ferrari
        for (int i = 0; i < garage.length; i++) {
            System.out.println(garage[i].getMake() + " " + garage[i].getModel());
        }



    }
}

// most important question of CSC164
// what is a class?
// What is an object?
/*
Classes are user-defined data types that act as the blueprint for individual objects, attributes and methods. Objects are instances of a class created with specifically defined data. Objects can correspond to real-world objects or an abstract entity.
What is Object-Oriented Programming (OOP)? - TechTarget
https://www.techtarget.com/searchapparchitecture/definition/object-oriented-programming-OOP#:~:text=Classes%20are%20user%2Ddefined%20data,objects%20or%20an%20abstract%20entity.
 */

// by convention, class first letter should be capital
class Car {
    // static variables...
    // data shared by ALL cars...
    static final int GOVT_TOP_SPEED = 155;
    static int INSPECTION_DAYS = 365;


    /*
    typically, data fields up top
    followed by constructors
    followed by methods
     */

    // String is a reference type
    private String make, model;

    // int is a primitive type
    private int miles, speed;


    // if no constructor included
    // default no-arg constructor is there implicitly

    // might want to write explicit constructors...
    // to initialize objects

    // no arg constructor
    Car() {
        // initialize with some default values
        miles = 0;
        make = "unknown";
        model = "unknown";
    }

    // overloaded constructor
    // overloading methods - just another constructor
    // but different parameters... extra information coming in
    Car(String make, String model) {
        miles = 0; // could write this as this.miles = 0;

        // this keyword is optional, but necessary in this cas
        // to differentiate "this" object's instance variable
        // make, versus the "make" variable from the parameter
        this.make = make;
        this.model = model;
    }

    // getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getMiles() {
        return miles;
    }

    // setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    // I find myself setting make/model TOGETHER all the time
    public void setMakeAndModel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setMakeAndModel(String[] info) {

    }

    public void setAllCarInfo(String make, String model, int miles) {

    }

    // general methods... behaviors of the class
    public void drive() {
        miles++;
    }

    public void accelerate() {
        if (speed > GOVT_TOP_SPEED) {
            // call the po po
        } else {
            speed++;
        }
    }

    static void cancelAllInspections() {
        INSPECTION_DAYS = 999999;
    }
}

class ElectricVehicle extends Car {
    private int batteryLevel;
}

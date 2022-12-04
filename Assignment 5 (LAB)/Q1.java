
/*
    Since multiple inheritance is not allowed in java, 
    hence one class cannot inherit from multiple classes 
    Therefore BlueWhale cannot inherit from both Mammals and MarineAnimals
*/
class Mammals {
    void print() {
        System.out.println("I am mammal");
    }
}

class MarineAnimals {
    void print() {
        System.out.println("I am a marine animal");
    }
}

class BlueWhale {
    void print() {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
}

public class Q1 {

    public static void main(String args[]) {
        Mammals mammalsObj = new Mammals();
        MarineAnimals marineAnimalsObj = new MarineAnimals();
        BlueWhale blueWhaleObj = new BlueWhale();

        mammalsObj.print(); // 1
        marineAnimalsObj.print(); // 2
        blueWhaleObj.print(); // 3

        // Since multiple inheritance is not supported, the 4th point cannot be
        // implemented,
        // thus the first three are done only without any inheritance.
    }
}

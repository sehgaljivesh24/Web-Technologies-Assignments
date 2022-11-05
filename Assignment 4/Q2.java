class Employee{
    String name;
    int joiningYear;
    int salary;
    String address;

    Employee(String name, int joiningYear, int salary, String address){
        this.name=name;
        this.joiningYear=joiningYear;
        this.salary=salary;
        this.address=address;
    }

    void printInfo(){
        System.out.println(this.name+"\t\t"+this.joiningYear+"\t    "+this.salary+"     $"+this.address);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994,100000 , "64C- WallsStreet");
        Employee emp2 = new Employee("Sam", 2000, 200000, "68D- WallsStreet");
        Employee emp3 = new Employee("John", 1999, 130000, "26B- WallsStreet");

        System.out.println("Name\tYear of Joining     Salary      Address");
        
        emp1.printInfo();
        emp2.printInfo();
        emp3.printInfo();
    }   
}
import java.util.Scanner;

class Marks {
    int rollNum, marks;
    String name;
}

class Physics extends Marks {
    Physics(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Chemistry extends Marks {
    Chemistry(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Mathematics extends Marks {
    Mathematics(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Physics arr1[] = new Physics[n];
        Chemistry arr2[] = new Chemistry[n];
        Mathematics arr3[] = new Mathematics[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String temp = sc.next();
            System.out.print("Enter marks in physics, chemistry, mathematics respectively seperated by space: ");

            // PHYSICS

            int Marks = sc.nextInt();
            Physics p = new Physics(temp, Marks);
            arr1[i] = p;

            // CHEMISTRY

            Marks = sc.nextInt();
            Chemistry c = new Chemistry(temp, Marks);
            arr2[i] = c;

            // MATHS

            Marks = sc.nextInt();
            Mathematics m = new Mathematics(temp, Marks);
            arr3[i] = m;
        }

        sc.close();

        int physicsTotal, chemTotal, mathTotal;

        physicsTotal = chemTotal = mathTotal = 0;

        for (int i = 0; i < n; i++) {
            physicsTotal += arr1[i].marks;
            chemTotal += arr2[i].marks;
            mathTotal += arr3[i].marks;
        }

        for (int i = 1; i <= n; i++)
            System.out.println("Total marks of student " + (i) + ": "
                    + (arr1[i - 1].marks + arr2[i - 1].marks + arr3[i - 1].marks));

        System.out.println("Average marks of the class in physics: " + (physicsTotal * 1.0 / n));
        System.out.println("Average marks of the class in chemistry: " + (chemTotal * 1.0 / n));
        System.out.println("Average marks of the class in chemistry: " + (mathTotal * 1.0 / n));
        System.out.println("Average total marks of the class: " + (mathTotal + chemTotal + physicsTotal) * 1.0 / n);
    }
}
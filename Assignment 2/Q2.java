public class Q2 {

    public static void main(String[] args) {

        int num1 = 674, num2 = 91234, num3 = 24;
        int minNo = 0;

        if (num1 < num2) {
            if (num1 < num3) {
                minNo = num1;
            } else {
                minNo = num3;
            }
        } else {
            if (num2 < num3) {
                minNo = num2;
            } else {
                minNo = num3;
            }
        }

        System.out.println("The Smallest No. is: " + minNo);
    }
}
import java.util.Scanner;

class Customer {
    String name, address;
    int age;
}

class Account {
    String accType, branchType;
}

// Base class
class RBI {
    int withLimit, n;
    double A, P, r;
    float t;
    long avg, tot, mb;

    int setWithdrawalLimit() {
        Scanner scn = new Scanner(System.in);
        String actype = scn.nextLine();
        String brtype = scn.nextLine();

        if (actype == "SAVINGS" && brtype == "METRO") {
            withLimit = 5000;

        }

        else {
            withLimit = 4000;
        }

        return withLimit;
    }

    double setInterestRate() {
        A = (P + r) / n * t;
        return A;
    }

    long setMAB() {
        mb = (avg * tot) / 31;
        return mb;
    }

}

// Child class1
class SBI extends RBI {
    double setInterestRate() {
        A = P * (1 + r / n) + n * t;
        return A;
    }

    long setMAB() {
        mb = (avg + tot) / 30;
        return mb;
    }
}

// Child class2
class ICICI extends RBI {
    double setInterestRate() {
        A = (P * r) / n + t;
        return A;
    }

    int setWithdrawalLimit() {
        withLimit = 7000;
        return withLimit;
    }
}

class Q2 {
    public static void main(String args[]) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();

        sbi.P = 10.433;
        sbi.r = 7.42;
        sbi.n = 5;
        sbi.t = 7;

        Double sbiInt = sbi.setInterestRate();
        System.out.println("SBI interest rate is:" + sbiInt);

        int iciciWL = icici.setWithdrawalLimit();
        System.out.println("ICICI withdraw limit is:" + iciciWL);
    }
}
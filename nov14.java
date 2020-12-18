package nov14;

import java.util.Scanner;

public class Nov14 {

    public static void main(String[] args) {

        Male m = new Male();
        Human mm;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Male or 2 for female ");

        int choice;
        choice = sc.nextInt();
        if (choice == 1 || choice == 2) {

            if (choice == 1) {
                mm = new Male();

            } else {
                mm = new Female();
            }
            mm.talk();
           mm.walk();
        } else {
            System.out.println("not a valid choice");
        }

        System.out.println("no. of bones: " + m.nob);

    }

}

abstract class Human {

    int nob = 206;

    abstract void talk();

    void walk() {
        System.out.println("Humans walk..");
    }

}

class Male extends Human {

    @Override
    void talk() {
        System.out.println("Male humans also talk");
    }
}

class Female extends Human {

    @Override
    void talk() {
        System.out.println("Female humans talk more");
    }
}

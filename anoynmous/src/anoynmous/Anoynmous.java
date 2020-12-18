package anoynmous;

public class Anoynmous {

    public static void main(String[] args) {
        sa d = new sa();
        d.o.main();
    }

}

class sameer //ya class anonymous ko implement karay ge
{

    void main() {

        System.out.println("sameer");

    }

}

class sa {

    sameer o = new sameer() {
        @Override
        public void main() {
                System.out.println("pagal love you");
        }
    };
}

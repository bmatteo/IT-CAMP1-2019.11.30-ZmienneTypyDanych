public class Main2 {
    public static void main(String[] args) {

        int wiek = 4;

        if(wiek < 27) {
            System.out.println("Młody");
        } else if(wiek < 80) {
            System.out.println("Sredni");
        } else {
            System.out.println("Stary");
        }

        switch (wiek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("ma mniej niż 7 lat !!");
            case 7:
            case 8:
            case 9:
                System.out.println("ma mniej niż 10 lat !! ale więcej niż sześć !!");
        }

    }
}

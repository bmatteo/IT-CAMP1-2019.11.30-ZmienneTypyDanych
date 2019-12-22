public class Main4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for(int i = 0; i < 100; i++) {
            numbers[i] = i;
        }

        int i = 0;
        for(int zmiennaPomocnicza : numbers) {
            System.out.println("Index: " + i++ + " wartość: " + zmiennaPomocnicza);
        }

        int number = -1000;
        while (number > -100) {
            System.out.println("coś się tu dzieje !!");
            System.out.println(number);
            number = number - 15;
        }

        int number2 = -1000;
        do {
            System.out.println("coś się tu dzieje !! Pętla do-while");
            System.out.println(number2);
            number2 = number2 - 15;
        } while (number2 > -100);
    }
}

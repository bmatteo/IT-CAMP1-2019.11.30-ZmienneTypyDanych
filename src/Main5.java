public class Main5 {
    public static void main(String[] args) {
        int[] numbers = new int[50];

        for(int i = 0; i < 50; i++) {
            numbers[i] = (i*2)+1;

            System.out.println("Index: " + i + " - wartość: " + numbers[i]);
        }
    }
}

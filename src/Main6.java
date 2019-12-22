import java.lang.reflect.Array;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {

        int[][] numbers = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = i*j;

                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

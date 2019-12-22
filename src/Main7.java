public class Main7 {
    public static void main(String[] args) {
        double[] tab = {-3.7, -1.1, -3.3, -8.5, -1.4, -0.9, -2345.3};

        double max = tab[0];

        for(int i = 1; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println(max);

    }
}

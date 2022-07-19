import java.util.ArrayList;

public class BilanganPrima {
    public static void main(String[] args) {

        ArrayList<Integer> prima = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            int bilangan = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {
                    bilangan = bilangan + 1;
                }
            }
            if (bilangan == 2) {
                prima.add(i);
            }
        }
        System.out.println(prima);
    }
}

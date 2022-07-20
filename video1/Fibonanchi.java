package video1;
import java.util.ArrayList;

public class Fibonanchi {
    public static void main(String[] args) {
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        int bilPertama = 0;
        int bilanganKedua = 1;

        for (int i = 0; i <= 10; i++) {
            if (i == 0 && i == 1) {
                fibo.add(i);
            } else {
                int total = bilPertama + bilanganKedua;
                fibo.add(total);
                // System.out.println(total);
                bilPertama = bilanganKedua;
                bilanganKedua = total;
            }
        }
        System.out.println(fibo);
    }
}

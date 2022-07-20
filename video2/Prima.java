package video2;

import java.util.ArrayList;
import java.util.Scanner;

class Prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batas = sc.nextInt();
        ArrayList<Integer> tampungNilai = new ArrayList<>();

        for (int i = 1; i <= batas; i++) {
            int prima = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {
                    prima += 1;
                }
            }

            if (prima == 2) {
                tampungNilai.add(i);
            }
        }
        System.out.println(tampungNilai);
    }
}
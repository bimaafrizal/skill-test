package leetcode;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        int angka = -7890;
        boolean negative = false;
        try {
            String stringAngka = String.valueOf(angka);
            ArrayList<String> arrReverse = new ArrayList<>();
            String reverseString = "";
            int reverseStringFull = 0;

            if (String.valueOf(stringAngka.charAt(0)).equals("-")) {
                negative = true;
            }

            if (negative) {
                for (int i = 1; i < stringAngka.length(); i++) {
                    arrReverse.add(String.valueOf(stringAngka.charAt(i)));
                }
            } else {
                for (int i = 0; i < stringAngka.length(); i++) {
                    arrReverse.add(String.valueOf(stringAngka.charAt(i)));
                }
            }

            if (arrReverse.get(arrReverse.size() - 1).equals("0")) {
                arrReverse.remove(arrReverse.size() - 1);
            }
            for (int j = arrReverse.size() - 1; j >= 0; j--) {
                reverseString = reverseString.concat(arrReverse.get(j));
            }
            if (negative) {
                reverseString = "-".concat(reverseString);
            }
            reverseStringFull = Integer.parseInt(reverseString);
            System.out.println(reverseStringFull);
        } catch (Exception e) {
            System.out.println(0);
        }

    }
}

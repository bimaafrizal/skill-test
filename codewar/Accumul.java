package codewar;

import java.util.ArrayList;

public class Accumul {
    public static void main(String[] args) {
        // String test = "Asb";
        // // System.out.println(test.length());
        // String fullText = test;
        // String upperStr = " ";
        // String lowerStr = " ";
        // int length = test.length();
        // String repeatStr = "";
        // String maxText = " ";
        // String textTem = " ";
        // ArrayList<String> txtString = new ArrayList<>();

        // for (int i = 0; i < length; i++) {
        // textTem = String.valueOf(fullText.charAt(i));
        // upperStr = textTem.toUpperCase();
        // lowerStr = upperStr.toLowerCase();
        // if (i > 0 && i != length - 1) {
        // for (int x = 1; x <= i; x++) {
        // repeatStr += lowerStr;
        // }

        // txtString.add(upperStr + repeatStr + "-");
        // repeatStr = "";
        // } else if (i == length - 1) {
        // txtString.add(upperStr.concat(repeatStr));
        // System.out.println(upperStr);
        // repeatStr = "";
        // } else {
        // txtString.add(upperStr + "-");
        // repeatStr = "";
        // }
        // }
        // for (int y = 0; y < txtString.size(); y++) {
        // maxText += txtString.get(y);
        // }

        // System.out.println(txtString);

        System.out.println(accum("asB"));
    }

    static String accum(String s) {
        String fullText = s;
        String upperStr = " ";
        String lowerStr = " ";
        int length = s.length();
        String repeatStr = "";
        String maxText = "";
        String textTem = " ";
        ArrayList<String> txtString = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            textTem = String.valueOf(fullText.charAt(i));
            upperStr = textTem.toUpperCase();
            lowerStr = upperStr.toLowerCase();
            if (i > 0 && i != length - 1) {
                for (int x = 1; x <= i; x++) {
                    repeatStr += lowerStr;
                }

                txtString.add(upperStr + repeatStr + "-");
                repeatStr = "";
            } else if (i == length - 1) {
                for (int x = 1; x <= i; x++) {
                    repeatStr += lowerStr;
                }
                txtString.add(upperStr.concat(repeatStr));
                repeatStr = "";
            } else {
                // textTem = String.valueOf(fullText.charAt(i));
                // upperStr = textTem.toUpperCase();
                txtString.add(upperStr + "-");
                repeatStr = "";
            }
        }
        for (int y = 0; y < txtString.size(); y++) {
            maxText += txtString.get(y);
        }
        return maxText;
    }
}

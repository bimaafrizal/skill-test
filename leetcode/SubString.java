package leetcode;

public class SubString {
    public static void main(String[] args) {
        // String text = "aaaabbrdsss";
        // int length = text.length();
        // String subTxt = text.substring(1, length - 1).toLowerCase();
        // String textTemp = "";
        // int lengthText = 0;

        // for (int i = 0; i < subTxt.length(); i++) {
        //     boolean alphabet = false;
        //     for (int j = 0; j < subTxt.length(); j++) {
        //         if (subTxt.charAt(i) == subTxt.charAt(j)) {
        //             alphabet = true;

        //         }
        //     }
        //     if (alphabet == true) {
        //         if (textTemp.contains(String.valueOf(subTxt.charAt(i))) == false)
        //             textTemp = textTemp.concat(String.valueOf(subTxt.charAt(i)));
        //     }
        // }
        // lengthText = textTemp.length();
        // System.out.println(lengthText);

        System.out.println(lengthOfLongestSubstring("aaaabbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        String subTxt = s.substring(1, length - 1).toLowerCase();
        String textTemp = "";
        int lengthText = 0;

        for (int i = 0; i < subTxt.length(); i++) {
            boolean alphabet = false;
            for (int j = 0; j < subTxt.length(); j++) {
                if (subTxt.charAt(i) == subTxt.charAt(j)) {
                    alphabet = true;

                }
            }
            if (alphabet == true) {
                if (textTemp.contains(String.valueOf(subTxt.charAt(i))) == false)
                    textTemp = textTemp.concat(String.valueOf(subTxt.charAt(i)));
            }
        }
        lengthText = textTemp.length();
        return lengthText;
    }
}

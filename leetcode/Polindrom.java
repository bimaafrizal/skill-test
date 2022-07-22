package leetcode;

import java.util.ArrayList;

public class Polindrom {
    public static void main(String[] args) {
        int input = 121;
        int input3 = 10;
        ArrayList<String> arrayInt = new ArrayList<>();
        int input2 = -121;
        
        String inpuString = String.valueOf(input3);
        String reverseStr = "";
        for(int i = inpuString.length()-1; i >= 0 ; i--){
            reverseStr = reverseStr.concat(String.valueOf(inpuString.charAt(i)));
        }

        if(reverseStr.equals(inpuString)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

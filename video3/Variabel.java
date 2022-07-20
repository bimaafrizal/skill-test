package video3;

import java.util.ArrayList;

//"KD Brg: 7638843, NmBrg=Susu Bear Brand, HrgBrg:11.500, QtyBrg=4, TtlBayar:46.000"
//output
//Kd_Brg = 7638843
//NmBrg = Susu Bear Brand
//HrgBrg =11.500
//QtyBrg = 4
//TtlBayar: 46.000

public class Variabel {
    public static void main(String[] args) {
        String text = "KD Brg: 7638843, NmBrg=Susu Bear Brand, HrgBrg:11.500, QtyBrg=4, TtlBayar:46.000";
        String[] arrStr = text.split(",");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < arrStr.length; i++) {
            list.add(arrStr[i]);
        }
        System.out.println(list);

        // System.out.println(arrStr.length);
        // for (int i = 0; i < arrStr.length; i++) {
        // System.out.println(arrStr[i]);
        // }
    }
}

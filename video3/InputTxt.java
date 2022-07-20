package video3;

import java.util.Arrays;

//ambil data harga input test, ubah menjadi 675000
public class InputTxt {
    public static void main(String[] args) {
        String txt = "total pembelian baju dinas sebesar Rp 675.000";
        String[] txtSplit = txt.split(" ");
        System.out.println(Arrays.toString(txtSplit));
        String getText = txtSplit[txtSplit.length - 1];
        System.out.println(getText);
        String replaceTxt = getText.replace(".", "");
        System.out.println(replaceTxt);
    }
}

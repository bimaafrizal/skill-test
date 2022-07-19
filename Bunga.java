// a menabung sebesar 750k dibulan pertama dapat bunga 6% pada bulan berikutnya, 
//bulan berikutnya andi menusuhkan 3% dari tabungan dan maksimal yang disihkan 3% dari total tabungan

public class Bunga {
    public static void main(String[] args) {
        float tabungan = 750000;
        float bunga = 0;
        float sisih = 0;
        // tabungan setelah 12 bulan
        for (int i = 1; i <= 12; i++) {
            bunga = tabungan * 6/100;
            if (tabungan <= 800000) {
                tabungan += bunga - tabungan * 3/100;
            } else {
                tabungan += bunga - 800000 * 3/100;
            }
            // if (i == 1) {
            //     tabungan = 750000;
            // } else {
            // }
        }
        System.out.println(tabungan);
    }
}

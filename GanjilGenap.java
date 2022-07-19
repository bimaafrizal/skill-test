import java.util.ArrayList;

// memisahkan ganjil dan genap angka 1 s/d 100

class GanjilGenap {
    public static void main(String[] args) {
        ArrayList<Integer> genapList = new ArrayList<Integer>();
        ArrayList<Integer> ganjilList = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                genapList.add(i);
            } else {
                ganjilList.add(i);
            }
        }
        System.out.println("Genap: ");
        System.out.println(genapList);
        System.out.println("Ganjil :");
        System.out.println(ganjilList);

    }
}
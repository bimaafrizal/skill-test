import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] data = { 5, 2, 4, 242, 6, 2, 27, 28, 212, 145, 342, 128 };
        int max = 0;
        int min = data[1];
        double average = 0;
        int total = 0;
        // get max value array
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("Nilai max " + max);

        // get min value array
        for (int i = 0; i < data.length; i++) {
            if (min >= data[i]) {
                min = data[i];
            }
        }
        System.out.println("Nilai min " + min);

        // short
        // Arrays.sort(data);
        // System.out.println(Arrays.toString(data));
        // terkecil to terbesar

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));

        // terbesar to terkecil
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));

        // rata2
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        average = total / data.length;
        System.out.println("rata2 " + average);
        int[] latihanArray = { 4, 5, 2, 1, 6 };
        
        for (int i = 0; i < latihanArray.length; i++) {
            for (int j = 0; j < latihanArray.length - 1; j++) {
                if (latihanArray[j] > latihanArray[j + 1]) {
                    int temp = latihanArray[j];
                    latihanArray[j] = latihanArray[j + 1];
                    latihanArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Latihan: ");
        System.out.println(Arrays.toString(latihanArray));
    }
}

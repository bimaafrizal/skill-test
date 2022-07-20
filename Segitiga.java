public class Segitiga {
    public static void main(String[] args) {
        int a = 5;
        for (int b = 1; b <= a; b++) {
            for (int c = a - 1; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(" ");
        
        int x =5;
        for (int i = 1; i <= x; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i-1; l++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

public class Rekursif {
    public static void main(String[] args) {
        // membuat loop 1 -n
        loop(7);
        System.out.println(' ');
        genapLoop(12);
        System.out.println(' ');
        ganjilLoop(11);

    }

    static void loop(int x) {
        // System.out.print(x);
        if (x > 0) {
            loop(x - 1);
            System.out.print(x + " ");
        }
    }

    static void genapLoop(int x) {
        if (x > 2) {
            genapLoop(x - 1);
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
    }

    static void ganjilLoop(int x) {
        if (x > 2) {
            ganjilLoop(x - 1);
            if (x % 2 == 1) {
                System.out.print(x + " ");
            }
        }
    }

    static void primaLoop(int x) {
        if (x > 2) {
            primaLoop(x - 1);
            if (x % 2 == 1) {
                System.out.print(x + " ");
            }
        }
    }

}

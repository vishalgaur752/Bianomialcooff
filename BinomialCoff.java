public class BinomialCoff {
    public static int bioCoff(int n, int r) {
        int nf = 1;
        int rf = 1;
        int NmR = 1;
        for (int i = 1; i <= n; i++) {
            nf *= i;
        }
        for (int i = 1; i <= r; i++) {
            rf *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            NmR *= i;
        }
        int bioCof = nf / (rf * NmR);
        return bioCof;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(bioCoff(n, r));
    }
}

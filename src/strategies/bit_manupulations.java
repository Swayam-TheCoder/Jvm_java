package strategies;

public class bit_manupulations {
    public static void main(String[] args) {
        bit_manupulations bm = new bit_manupulations();
        int n = 6;
        bm.sortByBits(n);
    }

    public void sortByBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n = n >> 1;
        }

        System.out.println(count);
    }
}

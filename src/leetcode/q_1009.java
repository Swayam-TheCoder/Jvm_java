package leetcode;

public class q_1009 {
    public static void main(String[] args) {
        int n = 5;
        int bits = Integer.toBinaryString(n).length();
        int mask = (1<<bits) - 1;
        int res = n ^ mask;
        System.out.println(res);
    }
}

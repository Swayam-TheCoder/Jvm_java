package leetcode;

public class q_231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        q_231 qu = new q_231();
        int n=8;
        if(qu.isPowerOfTwo(n)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

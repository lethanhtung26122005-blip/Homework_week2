public class Solution1_8 {
    public static boolean Palindrome(int n) {
        int m = Math.abs(n);
        int k = 0;
        while(m != 0) {
            int temp = m%10;
            m = m/10;
            k = k*10 + temp;
        }
        if(k == Math.abs(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        Solution1_8 f = new Solution1_8();
        System.out.println(f.Palindrome(-1221));
    }
}

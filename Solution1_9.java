public class Solution1_9 {
    public static int sumofdigit(int n) {
        int m = Math.abs(n);
        int k =0;
        while(m != 0) {
            int temp = m%10;
            m /= 10;
            k += temp;
        }
        return k;
    }
    public static void main(String[] args) {
        Solution1_9 f = new Solution1_9();
        System.out.println(f.sumofdigit(12356));
    }
}

public class Solution1_7 {
    public static int reverse(int n) {
        int m = Math.abs(n);
        int k = 0;
        while(m != 0) {
            int temp;
            temp = m%10;
            m = m/10;
            k = k*10 + temp;
        }
        if(n >=0) return k;
        else return k*(-1);
    }
    public static void main(String[] args) {
        System.out.println(Solution1_7.reverse(12345));
    }
}

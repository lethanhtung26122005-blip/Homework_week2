public class Solution {
    public static long fibonacci(long n) {
        long total = 0;
        if(n==-1) {
            return -1;
        } else if(n==0) {
            total += 0;
        } else if(n==1)  {
            total += 1;
        } else {
            total += fibonacci(n-1) + fibonacci(n-2);
        }
        return total;
    }
    public static void main(String[] args){
        Solution f1 = new Solution();
        long total = f1.fibonacci(19);
        System.out.println(total);
    }
}

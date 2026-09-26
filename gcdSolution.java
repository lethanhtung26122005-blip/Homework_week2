public class gcdSolution {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int m = gcdSolution.gcd(48,18);
        System.out.println(m);
    }
}

public class Solution1_10 {
    public static int secondlarge(int arr[],int n) {
        int second = Integer.MIN_VALUE;
        //bubble sort
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        second = arr[n-2];
        return second;
    }
    public static void main(String[] args) {
        int arr[] = {-4, 12, 0, 2, 9, -7};
        Solution1_10 f = new Solution1_10();
        System.out.println(f.secondlarge(arr, 6));
    }
}

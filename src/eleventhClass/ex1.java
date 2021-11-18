package eleventhClass;

public class ex1 {

    public static void main(String[] args) {
        int[] arr = {5,1,4,3,6,8,10,7,9};
        int n = arr.length;
        int idx = findElement(arr,n);
        System.out.println("idx = " + idx);
    }

    public static int findElement(int arr[], int n) {
        for (int i = 1; i < n - 1; i++) {
            int j = i - 1;
            int k = i + 1;

            while (arr[j] < arr[i] && arr[k] > arr[i]) {
                if (j == 0 && k == n - 1) {
                    return i;
                }
                if (j > 0) {
                    j--;
                }
                if (k < n - 1) {
                    k++;
                }
            }
        }
        return -1;
    }

}

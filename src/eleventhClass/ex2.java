package eleventhClass;

public class ex2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        findElementFn(arr,n);
    }

    public static void findElementFn(int arr[], int n) {
        int leftMax[] = new int[n];
        int rightMin[] = new int[n];

        for (int i = 1; i < n; i++) {
            if (leftMax[i - 1] > arr[i - 1]) {
                leftMax[i] = leftMax[i - 1];
            } else {
                leftMax[i] = arr[i - 1];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (rightMin[i + 1] > arr[i + 1]) {
                rightMin[i] = arr[i + 1];
            } else {
                rightMin[i] = rightMin[i + 1];
            }
        }
        int sts = 0;
        for (int i = 0; i < n; i++) {
            if (leftMax[i] < arr[i] && rightMin[i] > arr[i]) {
                System.out.println(i);
                sts = 1;
            }
        }

        if (sts == 0) {
            System.out.println("-1");
        }
    }
}

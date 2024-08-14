class mergeSort {

    public static void main(String[] args) {
        long[] arr = {7, 2, 3, 1, 9};
        int lowBound = 0;
        int upperBound = arr.length - 1;

        mergeSorting(arr, lowBound, upperBound);

        // Print the sorted array
        for (long num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSorting(long[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            mergeSorting(arr, lb, mid);
            mergeSorting(arr, mid + 1, ub);

            // Merge the subarrays back together
            merge(arr, lb, mid, ub);
        }
    }

    private static void merge(long[] arr, int lowPtr, int mid, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int n = upperBound - lowerBound + 1;

        long[] workSpace = new long[n];

        int highPtr = mid + 1;
        int workSpaceIndex = 0;

        // Merge the subarrays into the workspace
        while (lowPtr <= mid && highPtr <= upperBound) {
            if (arr[lowPtr] < arr[highPtr]) {
                workSpace[workSpaceIndex++] = arr[lowPtr++];
            } else {
                workSpace[workSpaceIndex++] = arr[highPtr++];
            }
        }

        // Copy the remaining elements of the left subarray, if any
        while (lowPtr <= mid) {
            workSpace[workSpaceIndex++] = arr[lowPtr++];
        }

        // Copy the remaining elements of the right subarray, if any
        while (highPtr <= upperBound) {
            workSpace[workSpaceIndex++] = arr[highPtr++];
        }

        // Copy the merged data from the workspace back into the original array
        for (j = 0; j < n; j++) {
            arr[lowerBound + j] = workSpace[j];
        }
    }
}

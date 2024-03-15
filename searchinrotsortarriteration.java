public class searchinrotsortarriteration {
    public static int modifBinSearchIter(int arr[], int tar) {
        int i, j;
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= tar && tar <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else {
                if (arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tarInd = modifBinSearchIter(arr, 0);
        System.out.println(tarInd);
    }
}

public class searchinrotatedsortedarray {
    public static int modifiedBinSearch(int arr[], int tar, int si, int ei) {
        // base case(Target Not Found)
        if(si>ei)
        {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        // Target Found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a:left part of mid
            if (arr[si] <= tar && tar <= arr[mid]) {
                return modifiedBinSearch(arr, tar, si, mid - 1);
            }
            // case b:right part of mid
            else {
                return modifiedBinSearch(arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c:right part of mid
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return modifiedBinSearch(arr, tar, mid + 1, ei);
            }
            // case d:left part of mid
            else {
                return modifiedBinSearch(arr, tar, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tarInd=modifiedBinSearch(arr, 0, 0, arr.length-1);
        System.out.println(tarInd);
    }
}

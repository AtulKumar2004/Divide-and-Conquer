public class quicksort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        // last element
        int pInd = partition(arr,si,ei);
        quickSort(arr,si,pInd-1); // for left part of pivot element
        quickSort(arr,pInd+1,ei); // for right part of pivot element
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei]; // pivot element
        int i=si-1; // to make places for elements smaller than pivot
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,8,9};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

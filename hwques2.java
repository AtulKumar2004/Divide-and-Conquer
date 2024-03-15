public class hwques2 {
    public static int check(int arr[], int i, int j) {

        if (i == -1) {
            return -1;
        }
        int check = check(arr, i - 1, j);
        if (check == -1 && i != j && arr[i] != arr[j]) {
            return -1;
        } else if (check == -1 && i != j && arr[i] == arr[j]) {
            return 1;
        }
        return check;

    }

    public static void majority(int arr[], int i, int j, int c) {
        if (i == arr.length) {
            return;
        }
        if (i == j) {
            int check = check(arr, i, j);
            if (check == 1) {
                // i++;
                // j=i;
                // c=0;
                majority(arr, i + 1, i + 1, 0);
            } else {
                majority(arr, i, j + 1, c + 1);
            }
        } else if (j == arr.length) {
            // i++;
            // j=i;
            // c=0;
            majority(arr, i + 1, i + 1, 0);
        }

        else if (arr[i] == arr[j]) {
            c++;
            if (c > arr.length / 2) {
                System.out.print(arr[i] + " ");
            }

            majority(arr, i, j + 1, c);
        } else {
            majority(arr, i, j + 1, c);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        majority(arr, 0, 0, 0);
    }
}
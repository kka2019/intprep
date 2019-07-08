package Arrays;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }
    }

    public static int arrayManipulation(int arr, int[][] queries){
        int maxValue = 0;

        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            for(int j=a; j<=b; j++){
                arr[j] += k;
            }
        }
        return maxValue;
    }
}

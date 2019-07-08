package Arrays;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[][] queries = new long[m][3];

        for (int i = 0; i < m; i++) {
            queries[i][0] = scanner.nextLong();
            queries[i][1] = scanner.nextLong();
            queries[i][2] = scanner.nextLong();
        }

        System.out.println(arrayManipulation(n,queries));
    }

    public static long arrayManipulation(int n, long[][] queries){

        long[] arr = new long[n+1];
        for(int i=0; i<queries.length; i++){
            long a = queries[i][0] - 1;
            long b = queries[i][1];
            long k = queries[i][2];

//            for(int j=(int)a; j<=(int)b; j++){
//                arr[j] += k;
//            }

            arr[(int)a] +=  k;
            arr[(int)b] -= k;
        }

        long sum = 0;
        long max = 0;
        for(int i=0; i<n+1; i++){
            sum += arr[i];
            max = Math.max(max,sum);
        }
        return max;
    }

//    public static long maxArrayValue(long[] arr){
//        long max = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
}

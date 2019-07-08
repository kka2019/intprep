package WarmUp;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int pairs = 0;
        int count = 1;
        Arrays.sort(a);
        for(int i=0; i<n-1; i++){
            if(a[i] == a[i+1]){
                count++;
                if(i == n-2){
                    pairs = pairs + count / 2;
                }
            } else {
                pairs = pairs + count / 2;
                count = 1;
            }
        }
        System.out.println(pairs);
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class B1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
                long sum = 0;
                int min = Integer.MAX_VALUE;
                int secmin = Integer.MAX_VALUE;
            int n = sc.nextInt();
            while(n-->0){
                int m = sc.nextInt();
                int [] arr = new int[m];
                for(int i = 0;i<m;i++){
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                sum = sum+arr[1];
                if(min>arr[0]){
                    min = arr[0];
                }
                if(secmin>arr[1]){
                    secmin = arr[1];
                }
            }
            sum = sum - secmin;
            sum = sum + min;
            System.out.println(sum);

        }
    }
}

import java.util.*;
public class A1877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            int [] arr = new int[n-1];
            for(int i = 0;i<n-1;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n-1;i++){
                sum = sum + arr[i];
            }
            int ans = sum *-1;
            System.out.println(ans);
            
        }
    }
}

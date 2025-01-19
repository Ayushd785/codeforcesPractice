import java.util.*;
public class C1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int [] b = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int j = 0;j<n;j++){
                b[j] = sc.nextInt();
            }
            int sum = 0;
            int ans = sum;
            int maxb = -1;
            for(int i = 0;i<n;i++){
                if(k==0){
                    break;
                }
                
                maxb = Math.max(maxb, b[i]);
                sum = sum + a[i];
                k--;
                ans = Math.max(ans, sum + k*maxb);
                
            }
            System.out.println(ans);
        }
    }
}

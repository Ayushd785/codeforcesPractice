import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            // after ai kisi bhi case me ai+1 se chota hai to xhud gaye guru
            boolean isture = true;
            for(int i = 0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    isture = false;
                    break;
                }
                else{
                    a[i+1] = a[i+1]-a[i];
                    a[i] = 0;
                }
            }
            if(isture){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

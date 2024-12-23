import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] M = new int[m];
            for(int i = 0;i<m;i++){
                M[i] = sc.nextInt();
            }
            int [] K = new int[k];
            for(int i =0;i<k;i++){
                K[i] = sc.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            if(k == n){
                for(int i = 0 ;i<m;i++){
                    sb.append('1');
                }
            }
            else if(k<n-1){
                for(int i = 0 ;i<m;i++){
                    sb.append('0');
                }
            }
           else {
            int [] counter = new int[n+1];
           Arrays.fill(counter,-1);
           int missing = -1;
           boolean [] present = new boolean[n+1];
            for(int i = 0;i<k;i++){
                present[K[i]] = true;
            }
            for(int i = 1;i<=n;i++){
                if(!present[i]){
                    missing = i;
                    break;
                }
            }
           for(int i = 1;i<=m;i++){
                counter[M[i-1]] = i;
           }
           int idx = counter[missing];
           for(int i =0;i<m;i++){
               if(i == idx-1){
                    sb.append(1);
               }
               else{
                sb.append(0);
               }
           }}
           System.out.println(sb.toString());
        }
            
    }
}

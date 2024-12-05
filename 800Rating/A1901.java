import java.util.*;
public class A1901{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            int maxdist = 0;
            int prev = 0;
            for(int i = 0;i<n;i++){
                maxdist = Math.max(maxdist, arr[i]-prev);
                prev = arr[i];
            }
            
            maxdist = Math.max(maxdist, (x-prev)*2);
            System.out.println(maxdist);
            t--;
        }
    }
}
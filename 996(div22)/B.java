import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] b = new int [n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
            }
            int Zerotimes = 0;
            int mindonate = Integer.MAX_VALUE;
            int maxneed = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                if(a[i]<b[i]){
                    Zerotimes++;
                    maxneed = Math.max(maxneed, b[i]-a[i]);
                }
                else{
                    int diff = a[i] - b[i];
                    mindonate = Math.min(diff, mindonate);
                }
            }
            if(Zerotimes>1){
                System.out.println("NO");
                continue;
            }
            else{
                if(mindonate>=maxneed){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}

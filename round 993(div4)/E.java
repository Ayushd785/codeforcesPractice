import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            int ans = 0;
            for(int n = 0;n<=32;n++){
                if(Math.pow(k, n)>r2){
                    break;
                }
                long start = (int)((l2+Math.pow(k, n) -1)/Math.pow(k, n));
                long end = (int)(r2/Math.pow(k, n));

                  if (Math.min(end, r1) >= Math.max(start, l1))
                        ans += Math.min(end, r1) - Math.max(start, l1) + 1;


            }
            System.out.println(ans);
        }
    }
}

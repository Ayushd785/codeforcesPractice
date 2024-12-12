import java.util.*;

public class C1857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] b = new int[n * (n - 1) / 2]; 

            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(b); 
            int[] a = new int[n]; 

            int index = 0;
            for (int i = 0; i < n - 1; i++) {
                a[i] = b[index]; 
                index += (n - 1 - i); 
            }

            a[n - 1] = b[b.length - 1];

            for (int p : a) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

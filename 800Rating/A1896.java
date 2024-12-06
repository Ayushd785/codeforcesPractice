import java.util.*;

public class A1896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            if(arr[0] ==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
    }
    }
}

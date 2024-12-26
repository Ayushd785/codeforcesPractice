import java.util.*;

public class C1873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            char[][] arr = new char[10][10];
            
            for (int i = 0; i < 10; i++) {
                String line = sc.next(); 
                arr[i] = line.toCharArray();
            }

            int ans = 0;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j] == 'X') {
                        ans += i + 1; 
                    }
                }
            }

            int itar = 1;
            int ans2 = 0;
            for (int i = 5; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j] == 'X') {
                        ans2 += i + 1 - itar; 
                    }
                }
                itar += 2; 
            }

            System.out.println(ans);
            System.out.println(ans2);
        }
        sc.close();
    }
}

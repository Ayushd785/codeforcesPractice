import java.util.*;

public class A1890 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            
            int maxFrequency = 0;
            if(map.size()>2){
                System.out.println("No");
            }
            else if(map.size()==1){
                System.out.println("Yes");
            }
            else{
                    for (int freq : map.values()) {
                maxFrequency = Math.max(maxFrequency, freq);
            }

            // Determine if the array satisfies the conditions
            if (maxFrequency == n / 2 && n % 2 == 0) {
                System.out.println("Yes");
            } else if (maxFrequency == (n + 1) / 2 && n % 2 != 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            }
            

            t--; // Decrement the test case count
        }

        sc.close();
    }
}

import java.util.*;

public class D1690 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String arr = sc.next(); 
            
            HashMap<Character, Integer> map = new HashMap<>();
            
            for (int i = 0; i < k; i++) {
                map.put(arr.charAt(i), map.getOrDefault(arr.charAt(i), 0) + 1);
            }
            
            int i = 0;
            int j = k;
            int ans = map.getOrDefault('W', 0);
            while (j < n) {
                map.put(arr.charAt(i), map.getOrDefault(arr.charAt(i), 0) - 1);
                map.put(arr.charAt(j), map.getOrDefault(arr.charAt(j), 0) + 1);
                ans = Math.min(ans, map.getOrDefault('W', 0));
                i++;
                j++;
            }

            System.out.println(ans);
        }
    }
}

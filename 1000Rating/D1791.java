import java.util.*;
public class D1791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-- > 0) {
            int n = sc.nextInt(); 
            sc.nextLine(); 
            String s = sc.nextLine(); 
            HashMap<Character, Integer> mp = new HashMap<>();
            HashSet<Character> st = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }
            
            int ans = mp.size();
            for (int i = n - 1; i >= 0; i--) {
                char c = s.charAt(i);
                mp.put(c, mp.get(c) - 1);
                st.add(c);
                if (mp.get(c) == 0) {
                    mp.remove(c);
                }
                ans = Math.max(mp.size() + st.size(), ans);
            }
            System.out.println(ans);
        }
        sc.close(); 
    }
}

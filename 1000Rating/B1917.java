import java.util.*;
public class B1917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> st = new HashSet<>();
            int ans = 0;
            for(int i = 0;i<n;i++){
                if(st.contains(s.charAt(i))){
                    continue;
                }
                st.add(s.charAt(i));
                ans = ans + s.length() - i;
            }
            System.out.println(ans );
        }   
    }
}

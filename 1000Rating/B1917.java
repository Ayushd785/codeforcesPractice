import java.util.*;
public class B1917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<String> st = new HashSet<>();

            for (int i = s.length() - 1; i >= 0; i--) {
                String str = s.substring(i);

                st.add(str);

                if (str.length() > 1) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.deleteCharAt(1); 
                    st.add(sb.toString());
                }
            }
            System.out.println(st.size());
        }
    }
}

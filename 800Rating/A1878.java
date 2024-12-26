import java.util.*;
public class A1878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashSet<Integer> st = new HashSet<>();
            for(int i = 0;i<n;i++){
                st.add(sc.nextInt());
            }
            if(st.contains(k)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

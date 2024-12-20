import java.util.*;
public class B1909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            long ans = -1;
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            for(int i = 1;i<=61;i++){
                long num = 1l<<i;
                HashSet<Long> st = new HashSet<>();
                for(int j = 0;j<n;j++){
                    st.add(arr[j]%num);
                }
                if(st.size()==2){
                    ans = num;
                    break;
                }
            }
            System.out.println(ans);

    }
}
}
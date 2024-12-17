import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int [] b = new int[n];
            TreeSet<Integer> st = new TreeSet<>();
            for(int i = 1;i<=n;i++){
                st.add(i);
            }
            for(int i = 0;i<n;i++){
                if(st.contains(arr[i])){
                    b[i] = arr[i];
                    st.remove(arr[i]);
                }
                else{
                    b[i] = st.first();
                    st.remove(b[i]);
                }
            }
            for(int i = 0;i<n;i++){
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}
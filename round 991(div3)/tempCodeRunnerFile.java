
import java.util.*;

public class problemA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String [] arr = new String[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.next();
            }
            Stack<String> st = new Stack<>();
            for(int i = 0;i<n;i++){
                st.push(arr[i]);
            }
            int count = 0;
            while(!st.isEmpty()){
                String c = st.pop();
                int x = c.length();
                if(x<=m){
                    count++;
                    m = m - x;
                }
            }
            System.out.println(count);
            t--;
        }

    }

}
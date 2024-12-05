
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
            int count = 0;
            for(int i = 0;i<n;i++){
                int len = arr[i].length();
                if(m>=len){
                    count++;
                    m -=len;

                }
                else{
                    break;
                }
            }
            System.out.println(count);
            t--;
        }

    }

}
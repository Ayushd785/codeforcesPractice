
import java.util.*;

public class B1725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long D = sc.nextInt();
        long[] arr = new long[(int) N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[(int)N-1]*N<=D){
            System.out.println(0);
            return;
        }
        long ans = 0;
        int i = 0;
        int j = (int) N - 1; 
        while(i<=j){
            if(i == j){
                if(arr[i]>D){
                    ans++;
                }
                break;
                
            }
            if(arr[i]>D){
                ans++;
                i++;
            }
            else{
                int counter = 1;
                while(i + counter - 1 < j && arr[j]*counter<=D ){
                    counter++;
                }
                if(arr[j]*counter>D){
                    ans++;
                }
                j--;
                i = i + counter-1;
            }
        }
        System.out.println(ans);

    }
}

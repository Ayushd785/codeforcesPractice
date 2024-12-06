import java.util.*;
public class A1896{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean ans = true;
            for(int i = 0;i<n;i++){
                if(Math.abs((arr[i]-1)-i) == 1 || Math.abs((arr[i]-1)-i) == 0 ){
                    ans = true;
                }
                else{
                    ans = false;
                    break;
                }
            }
            if(ans){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
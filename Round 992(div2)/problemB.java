import java.util.*;

public class problemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int r = 0;
            int sum = 1;
            int count = 1;
            while(r<n){
                r = 2*sum+2;
                if(r>=n){
                    break;
                }
                sum = r;
                count++;
            }
            if(n>1){
                System.out.println(count+1);
            }
            else{
                System.out.println(count);
            }
        }

    
    }
}

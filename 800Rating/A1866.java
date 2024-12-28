import java.util.*;
public class A1866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
             if(arr[i]>=0){
                min = Math.min(min,arr[i]);
            }
            else{
                arr[i] = arr[i]*-1;
                min = Math.min(min,arr[i]);
            }
        }
        System.out.println(min);

        
    }
}

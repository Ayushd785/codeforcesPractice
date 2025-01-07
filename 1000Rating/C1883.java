import java.util.*;
public class C1883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            // check if any divisible present
            boolean isdiv = false;
            for(int i = 0;i<n;i++){
                if(arr[i]%k ==0){
                    isdiv = true;
                    break;
                }
            }
            if(isdiv){
                System.out.println(0);
            }
            else{
                if(k == 2){
                    System.out.println(1);
                }
                else if(k == 3){
                    int [] temp = new int[n];
                    for(int i =0;i<n;i++){
                        int rem = arr[i]%3;
                        if((arr[i] + rem)%3==0){
                            temp[i] = rem;
                        }
                        else{
                            temp[i] = k-rem;
                        }
                    }
                    Arrays.sort(temp);
                    System.out.println(temp[0]);
                }
                else if(k==4){
                    int even = 0;
                    int ans = -1;
                    int [] temp = new int[n];
                    for(int i =0;i<n;i++){
                        int rem = arr[i]%4;
                        if((arr[i] + rem)%4==0){
                            temp[i] = rem;
                        }
                        else{
                            temp[i] = k-rem;
                        }
                    }
                    for(int i = 0;i<n;i++){
                        if(arr[i]%2==0){
                            even++;
                        }
                    }
                    if(even>= 2){
                        ans = 0;
                    }
                    else if(even == 1){
                        ans = 1;
                    }
                    else if(even == 0){
                        ans = 2;
                    }
                    Arrays.sort(temp);
                    System.out.println(Math.min(temp[0],ans));
                }
                else if(k == 5){
                    int [] temp = new int[n];
                    for(int i =0;i<n;i++){
                        int rem = arr[i]%5;
                        if((arr[i] + rem)%5==0){
                            temp[i] = rem;
                        }
                        else{
                            temp[i] = k-rem;
                        }
                    }
                    Arrays.sort(temp);
                    System.out.println(temp[0]);
                }
            }
        }
    }
}

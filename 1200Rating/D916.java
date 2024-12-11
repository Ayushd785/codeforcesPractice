import java.util.*;
public class D916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[]a = new int[n];
            int[]b = new int[n];
            int[]c = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                c[i] = sc.nextInt();
            }


            ArrayList<int []> A = new ArrayList<>();
            ArrayList<int []> B = new ArrayList<>();
            ArrayList<int []> C = new ArrayList<>();
            for(int i=0;i<n;i++){
                int [] arr = new int[2];
                arr[0] = a[i];
                arr[1] = i;
                A.add(arr);
            }
            for(int i=0;i<n;i++){
                int [] arr = new int[2];
                arr[0] = b[i];
                arr[1] = i;
                B.add(arr);
            }
            for(int i=0;i<n;i++){
                int [] arr = new int[2];
                arr[0] = c[i];
                arr[1] = i;
                C.add(arr);
            }
              A.sort((x, y) -> Integer.compare(y[0], x[0]));
              B.sort((x, y) -> Integer.compare(y[0], x[0]));
              C.sort((x, y) -> Integer.compare(y[0], x[0]));
              int ans = 0;
              for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    for(int k =0;k<3;k++){
                        if(A.get(i)[1] == B.get(j)[1] || B.get(j)[1]==C.get(k)[1] || A.get(i)[1] == C.get(k)[1]){
                                continue;
                        }
                        else{
                            ans = Math.max(ans ,(A.get(i)[0] + B.get(j)[0] + C.get(k)[0]));
                        }
                    }
                }
              }
              System.out.println(ans);
              }         
        }
    }

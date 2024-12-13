import java.util.*;
public class B816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        List<int[]> recipes = new ArrayList<>();
        List<int[]> queries = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int[] temp = new int[2];
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
            recipes.add(temp);
        }
        for(int i = 0; i < q; i++) {
            int[] temp = new int[2];
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
            queries.add(temp);
        }
        int N = 200000 + 1; 
        int[] presum = new int[N];
        for(int i = 0; i < n; i++) {
            int l = recipes.get(i)[0];
            int r = recipes.get(i)[1];
            presum[l]++;
            if (r + 1 < N) { 
                presum[r + 1]--;
            }
        }
        for(int i = 1; i < presum.length; i++) { 
            presum[i] = presum[i] + presum[i - 1];
        }
        for(int i = 0;i<presum.length;i++){
            if(presum[i]>=k){
                presum[i] = 1;
            }
            else{
                presum[i] = 0;
            }
        }
        for(int i = 1; i < presum.length; i++) { 
            presum[i] = presum[i] + presum[i - 1];
        }

        for(int i = 0;i<q;i++){
            int a = queries.get(i)[0];
            int b = queries.get(i)[1];
            int ans = presum[b] - presum[a-1];
            System.out.println(ans);
        }
    }
}

import java.util.*;
public class Targetsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(0, n, arr, target, ans, 0, temp);
        System.out.println(ans);
        
    }
    static void solve(int idx , int n, int [] arr, int target,ArrayList<ArrayList<Integer>> ans , int sum,ArrayList<Integer> temp){
            if(idx>=n || sum > target){
                return;
            }
            if(sum == target ){
                ans.add(new ArrayList<>(temp));
                return;
            }
            // include
            temp.add(arr[idx]);
            solve(idx+1, n, arr, target, ans, sum + arr[idx], temp);

            //exclude
            temp.remove(temp.size()-1);
            solve(idx+1, n, arr, target, ans, sum, temp);
    }
    
}

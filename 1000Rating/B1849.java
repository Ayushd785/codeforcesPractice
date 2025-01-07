import java.util.*;


public class B1849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();       
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<pair> al = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int rem = arr[i]%k;
            if(rem==0){
                ans.add(i+1);
            }
            else{
                al.add(new pair(rem, i+1));
            }
        }
        Collections.sort(al,(a,b)->{
            if(b.first!=a.first){
                return b.first - a.first;
            }
            else{
                return a.second - b.second;
            }
        });
        for(int i = 0;i<al.size();i++){
            ans.add(al.get(i).second);
        }
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
}
    }
}
class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

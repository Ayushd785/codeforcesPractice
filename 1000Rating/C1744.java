
import java.util.ArrayList;
import java.util.Scanner;

public class C1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
             s = s+s;
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == 'g'){
                    al.add(i);
                }
            }
            int ans = 0;
            
            for(int i = 0;i<n;i++){
                if(s.charAt(i) == c){
                   int l = 0;
                   int r = al.size()-1;
                   int idx = -1;
                   while(l<=r){
                       int mid = l + (r-l)/2;
                       if(al.get(mid)>=i){
                        idx = mid;
                        r = mid -1;
                       }
                       else{
                        l = mid+1;
                       }
                   }
                   if(idx!=-1){
                    int dist = al.get(idx) - i;
                    ans = Math.max(ans, dist);
                   }

                }
            }
            System.out.println(ans);
            


        }
    }
}

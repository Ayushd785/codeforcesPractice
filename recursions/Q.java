import java.util.*;
public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        solve(n, al);
        System.out.println(al.size());
    }
    static void solve(int n,ArrayList<Integer> al){
        if(n == 1){
            al.add(1);
            return;
        }
        al.add(n);
        if(n%2!=0){
            solve((3*n)+1,al);
        }
        else{
            solve(n/2 , al);
        }
    }
}

public class sum {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solve(n));
    }
    static int solve(int n){
        if(n==0) return 0;
        return solve(n-1) + n;
    }
}

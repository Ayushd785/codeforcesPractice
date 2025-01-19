
        import java.io.*;
        import java.util.*;
        
        public class Solution {
            static class FastReader {
                BufferedReader br;
                StringTokenizer st;
        
                public FastReader() {
                    br = new BufferedReader(new InputStreamReader(System.in));
                }
        
                String next() {
                    while (st == null || !st.hasMoreElements()) {
                        try {
                            st = new StringTokenizer(br.readLine());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return st.nextToken();
                }
        
                int nextInt() { return Integer.parseInt(next()); }
                long nextLong() { return Long.parseLong(next()); }
                double nextDouble() { return Double.parseDouble(next()); }
        
                String nextLine() {
                    String str = "";
                    try {
                        str = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return str;
                }
            }
        
            // Constants
            static final int MOD = 1_000_000_007;
            static final int INF = Integer.MAX_VALUE;
            static final long LINF = Long.MAX_VALUE;
            static FastReader in = new FastReader();
            static PrintWriter out = new PrintWriter(System.out);
        
            // Useful functions
            static long gcd(long a, long b) {
                while (b != 0) {
                    long temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        
            static long lcm(long a, long b) {
                return (a / gcd(a, b)) * b;
            }
        
            static boolean isPrime(long n) {
                if (n <= 1) return false;
                if (n <= 3) return true;
                if (n % 2 == 0 || n % 3 == 0) return false;
                for (long i = 5; i * i <= n; i += 6) {
                    if (n % i == 0 || n % (i + 2) == 0) return false;
                }
                return true;
            }
        
            // Quick Sort implementation
            static void sort(int[] arr) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int x : arr) list.add(x);
                Collections.sort(list);
                for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);
            }
        
            public static void main(String[] args) {
                int t = in.nextInt();  // number of test cases
                while (t-- > 0) {
                    solve();
                }
                out.close();
            }
        
            static void solve() {
                // Example: Read input
                int n = in.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
        
                // Write your logic here
                
                // Example: Print output
                out.println("Your answer here");
            }
        }
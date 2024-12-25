import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int d = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            al.add(1);
            if(n>=3 || d%3==0){
                al.add(3);
            }
            if(d%5 == 0){
                al.add(5);
            }
            if(n>=3 || d%7==0)
                al.add(7);

            if(n<6 && d%9!=0){
                int mod = 1;
                for(int i =1 ;i<=n;i++){
                        mod = mod*i;
                        if((mod*d)%9==0){
                            al.add(9);
                            break;
                        }
                }
            }
            else if(n>=6 || d%9==0){          
                    al.add(9);
            }
            for(int i:al){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

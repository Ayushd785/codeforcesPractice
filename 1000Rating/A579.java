import java.util.*;
public class A579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int count = 0;
            while(x>0){
                count+= x&1;
                x = x>>1;
            }
            System.out.println(count);
        }
    }

import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a != 1 || b != 1){System.out.println(Math.abs(b-a));}
            else{
                System.out.println(1);
            }
        }
    }
}

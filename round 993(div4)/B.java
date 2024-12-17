import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i = a.length()-1;i>=0;i--){
                char c = a.charAt(i);
                if(c=='p'){
                    sb.append("q");
                }
                else if(c=='q'){
                    sb.append("p");
                }
                else{
                    sb.append(c);
                }                
            }
            System.out.println(sb);
        }
    }
}

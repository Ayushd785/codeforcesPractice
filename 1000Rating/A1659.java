
import java.util.*;

public class A1659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int gap = r/(b+1);
            int remaining = r%(b+1);
            // add the first block
            for(int i = 0;i<gap;i++){
                sb.append("R");
            }
            int y = 0;
            if(y<remaining){
                sb.append("R");
                y++;
            }
            
            for(int i = 0;i<b;i++){
                // add the b block
                sb.append("B");
                // add the r block 
                for(int j = 0;j<gap;j++){
                    sb.append('R');
                }
                if(y<remaining){
                    sb.append('R');
                    y++;
                }
            }
            System.out.println(sb.toString());
        }
    }
}

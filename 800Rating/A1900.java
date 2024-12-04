import java.util.Scanner;
import java.util.Stack;

public class A1900{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            String s = sc.next();
            int dot = 0;
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i<n;i++){
                char c = s.charAt(i);
                if(c == '.'){
                    dot++;
                }
                if(c!='#' && st.size()<3){
                    st.push(1);
                }
            }
                if(st.size()==3){
                    System.out.print(2);
                    
                }
                else if(st.size() ==0){
                    System.out.print(0);
                    
                }
                else{
                    System.out.println(dot);
                   
                }
            T--;

        }

        sc.close();
    }
}
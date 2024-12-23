import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    static void solve(Scanner sc){
        int n = sc.nextInt();
        String s = sc.next();
        int P = 0;
        int S = 0;
        int dot = 0;
        for(char c: s.toCharArray()){
            if(c == 's'){
                S++;
            }
            else if(c == 'p'){
                P++;
            }
            else{
                dot++;
            }
        }
        if((S == s.length()) || (P == s.length() )|| (dot == s.length())){
            System.out.println("YES");
        }
        else{
            boolean ans = true;
        boolean ifbefore = false;
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i) == '.'){
                continue;
            }
            if(s.charAt(i) == 's'){
                if(ifbefore){
                    ans = false;
                    break;
                }
            }
            else if(s.charAt(i) == 'p'){
                ifbefore = true;
            }
        }
        if(S==0 || P==0){
            System.out.println("YES");
        }
        else if(ans && P==1 && s.charAt(s.length()-1) == 'p'){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
    } 
        
}


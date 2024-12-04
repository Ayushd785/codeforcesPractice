    import java.util.Scanner;

    public class A1900{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T>0){
                int n = sc.nextInt();
                String s = sc.next();
                int count = 0;
                int dots = 0;
                boolean ans = false;
                for(int i = 0;i<n;i++){
                    char c = s.charAt(i);
                    if(c == '.'){
                        count++;
                        dots++;
                        if(count>=3){
                            ans = true;
                        }
                    }
                    else{
                        count = 0;
                    }
                }
                if(!ans){
                    System.out.print(dots);
                }
                else{
                    System.out.println(2);

                }
                
                T--;
            
            }
        }
    }
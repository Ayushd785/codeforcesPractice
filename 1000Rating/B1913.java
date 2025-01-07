import java.util.Scanner;
public class B1913 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int countZero = 0;
            int countone = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    countone++;
                }
                else{
                    countZero++;
                }
            }
            if(countone==countZero){
                System.out.println(0);
            }
            else{
                for(int i = 0;i<s.length();i++){
                    if(s.charAt(i)=='1'){
                        if(countZero==0){
                            System.out.println(s.length()-i);
                            break;
                        }
                        else{
                            countZero--;
                        }
                    }
                     if(s.charAt(i)=='0'){
                        if(countone==0){
                            System.out.println(s.length()-i);
                            break;
                        }
                        else{
                            countone--;
                        }
                    }

                }
            }

        }
    }
}
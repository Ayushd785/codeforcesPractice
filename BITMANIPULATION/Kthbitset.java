
public class Kthbitset {
    public static void main(String[] args) {
        int a = 13;
        int k = 1;
        System.out.println(leftshift(a, k));
        System.out.println(rightshift(a, k));


    }
    public static Boolean leftshift(int a, int k) {
        if((a & (1<<k))!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean rightshift(int a,int k){
        if((1 & (a>>k))!=0){
            return true;
        }
        else{
            return false;
        }
    }
}

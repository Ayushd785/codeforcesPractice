public class checkifpowerof2 {
    public static void main(String[] args) {
        int n = 13;
        int count = 0;
        while(n>0){
            count+= n&1;
            n = n>>1;
        }
        if(count==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

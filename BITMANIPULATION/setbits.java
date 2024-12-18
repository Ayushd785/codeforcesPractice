public class setbits {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        System.out.println(n | (1<<k)); // set
        System.out.println(n & ~(1<<k)); // unset
    } 
}

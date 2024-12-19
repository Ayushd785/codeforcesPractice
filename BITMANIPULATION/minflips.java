public class minflips {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        int ans = start^goal;
        int count = 0;
        while(ans>0){
            count+= ans & 1;
            ans = ans>>1;
        }
        
        System.out.println(count);
    }
}  
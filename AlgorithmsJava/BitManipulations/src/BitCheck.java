public class BitCheck {
    int cnt = 0;
    public  int check(int N){
        while(N != 0){
            N = N & (N-1);
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(new BitCheck().check(15));
    }
}

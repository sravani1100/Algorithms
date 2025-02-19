public class BitCount {
   /* int cnt = 0;
    public  int checkMethod1(int N){
        while(N != 0){
            N = N & (N-1);
            cnt++;
        }
        return cnt;
    } */
    public int checkMethod2(int N){
        int cnt = 0;
        while(N != 0){
            if((N & 1) == 1){
                cnt++;
            }
            N = N >> 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        //System.out.println(new BitCheck().checkMethod1(15));
        System.out.println(new BitCount().checkMethod2(14));
    }
}

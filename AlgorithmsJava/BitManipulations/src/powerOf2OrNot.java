public class powerOf2OrNot {
    //Method 1
    /* public boolean checkPowerMethod1(int N){
        for(int i = 1 ; i < N ; i++){
            if(N == (1 << i)){
                return true;
            }
        }
        return false;
    } */

    // Method 2
    public boolean checkPowerMethod2(int N){
        int cnt = 0;
        while(N != 0) {
            cnt++;
            N = N & (N - 1);
        }
        return (cnt == 1);
    }

    public static void main(String[] args) {
        //System.out.println(new powerOf2OrNot().checkPowerMethod1(256)); // true
        System.out.println(new powerOf2OrNot().checkPowerMethod2(63)); // false
    }
}

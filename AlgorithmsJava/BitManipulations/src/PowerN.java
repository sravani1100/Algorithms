public class PowerN {
    /*public int num(int x , int N){
        int ans = 1;
        for(int i = 0 ; i < N ; i++){
            ans *= x;
        }
        return ans;
    }*/

    //Method 2
    public int num(int x , int N){
        double ans = 1;
        double M = 1e9 + 7;
        double a = x % M;
        for(int i = 0 ; i < N; i++){
            ans = (ans * a) % M;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        //System.out.println(new PowerN().num(3 , 2)); // 9
        System.out.println(new PowerN().num(9 , 3)); // 729
    }
}

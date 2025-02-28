public class DivideTwoNumbers {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor)
            return 1;
        boolean sign = true;
        if(dividend < 0 && divisor > 0)
            sign = false;
        if(dividend >= 0 && divisor < 0)
            sign = false;
        int n = Math.abs(dividend);
        int d = Math.abs(divisor);
        int ans = 0 ;
        while(n >= d){
            int cnt = 0;
            while(n >= (d << (cnt + 1))){
                cnt++;
            }
            ans += (1 << cnt);
            n -= d * (1 << cnt);
        }
        if(ans > Integer.MAX_VALUE && sign)
            return Integer.MAX_VALUE;
        if(ans > Integer.MAX_VALUE && !sign)
            return Integer.MIN_VALUE;
        return sign ? ans :(-1 * ans);
    }

    public static void main(String[] args) {
        //System.out.println(new DivideTwoNumbers().divide(10 , 3)); // 3
        System.out.println(new DivideTwoNumbers().divide(7 , -2)); // -3
    }
}

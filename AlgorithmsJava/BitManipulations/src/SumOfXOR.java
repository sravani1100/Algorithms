public class SumOfXOR {

    /*public int solve(int[] nums, int n){
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans += (nums[i] ^ nums[j]);
            }
        }
        return ans;
    }*/


    public int sum(int[] arr, int n){
        int ans = 0;
        for(int bit = 0; bit <= 30; bit++){
            int cnt = 0;
            for(int i = 0; i < n; i++){
                if(((arr[i] >> bit) & 1) == 1)
                    cnt++;
            }
            ans = ans + cnt * (n - cnt) * (1 << bit);
        }
        return 2 * ans;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 18, 3};
        int n = arr.length;
        System.out.println(new SumOfXOR().sum(arr, n)); // 186
        }
}

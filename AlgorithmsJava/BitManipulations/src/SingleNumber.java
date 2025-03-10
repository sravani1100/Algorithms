public class SingleNumber {

    // All elements repeated twice except one
    /*public int number(int[] arr) {
        int ans = 0;
        for(int i = 0; i <= 31; i++) {
            int cnt = 0;
            for(int j = 0; j < arr.length; j++) {
                if(((arr[j] >> i) & 1) == 1)
                    cnt++;
            }
            if(cnt % 2 == 1) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }*/


    // All elements repeated thrice except one
    public int number(int[] arr) {
        int ans = 0;
        for(int i = 0; i <= 31; i++) {
            int cnt = 0;
            for(int j = 0; j < arr.length; j++) {
                if(((arr[j] >> i) & 1) == 1)
                    cnt++;
            }
            if(cnt % 3 == 1) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*int[] nums = {9, 10, 18, 8, 10, 5, 5, 9, 8};
        System.out.println(new SingleNumber().number(nums)); // 18 (All elements in nums (array) are repeated twice except one element*/

        int[] nums = {9, 10, 18, 10, 2, 64, 9, 9, 18, 2, 10, 18, 2};
        System.out.println(new SingleNumber().number(nums)); // 64 (All elements in nums (array) are repeated thrice except one element
    }
}

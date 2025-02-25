public class MinimumBitFlip {
    public int minBitsFlip(int start, int goal) {
        //your code goes here
        int num = start ^ goal;
        int count = 0 ;
        for(int i = 0 ; i < 32 ; i++){
            count += (num & 1);
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumBitFlip().minBitsFlip(10 , 7));  // 3
    }
}

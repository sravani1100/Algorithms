public class BitCheck {
    /* public boolean check1(int N , int n){
        return ((N >> n-1) & 1) == 1; //Method 1
    } */

     public boolean check2(int N , int n){
        return ((1 << n-1) & N) == (1 << n-1); //Method 2
    }

    public static void main(String[] args) {
        //System.out.println(new BitCheck().check1(35 , 6)); // true
        System.out.println(new BitCheck().check2(65 , 2)); // false
    }
}

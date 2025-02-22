public class SetBit {
    public int set(int x , int y){
        if(x == y){
            return (1 << x) | (1 << y);
        }
        return (1 << x) + (1 << y);
    }
    public static void main(String[] args) {
        //System.out.println(new SetBit().set(3 , 1)); // 10 (1010)
        System.out.println(new SetBit().set(4 , 4)); // 16 ( 10000 )
    }
}

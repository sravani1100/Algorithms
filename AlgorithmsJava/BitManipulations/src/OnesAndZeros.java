public class OnesAndZeros {

    //Method 1
    /*public int findNum(int x , int y){
        int a = 1;
        for(int i = 1; i < x ; i++){
            a = a + (1 << i);
        }
        return (a << y);
    }*/

    //Method 2
    /*public int findNum(int x , int y){
        int a = 0;
        while(x != 0){
            a = a << 1;
            a = a | 1 ;
            x--;
        }
        return (a << y);
    }*/

    //Method 3
    /*public int findNum(int x , int y){
        return ((1 << x) - 1) << y;
    }*/

    //Method 4
    public int findNum(int x , int y){
        return (1 << (x + y)) - (1 << y);
    }


    public static void main(String[] args) {
        //System.out.println(new OnesAndZeros().findNum(1 , 2));// 4 (100)
        //System.out.println(new OnesAndZeros().findNum(2 , 3)); //24 (11000)
        //System.out.println(new OnesAndZeros().findNum(3 , 4)); // 112 ( 1110000)
        System.out.println(new OnesAndZeros().findNum(2 , 2)); // 12 ( 1100 )
    }
}

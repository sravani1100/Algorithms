public class AddBinary {
    public String add(String a , String b){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        while(aLen >= 0 || bLen >= 0){
            int sum = 0;
            if(aLen >= 0){
                sum += a.charAt(aLen) - '0';
                aLen--;
            }
            if(bLen >= 0){
                sum += b.charAt(bLen) -'0';
                bLen--;
            }
            sum = sum + carry;
            carry = sum / 2;
            sb.append(sum % 2);
        }
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "101"; // 5
        String b = "110";// 6
        String result = new AddBinary().add(a , b);
        System.out.println(result); // 1011 (11)
    }
}

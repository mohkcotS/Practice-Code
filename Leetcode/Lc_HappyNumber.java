public class HappyNumber {
    public boolean isHappy(int n) {
        int a = 0;
        while (n != 89 ){
            while (n > 0){
                a +=  n%10 * n%10;
                n /= 10;
            }
            n = a;
            if(n == 19 || n == 1 || n == 68 || n == 100 || n == 82){
                return  true;
            }
            a = 0;
        }

        return false;
    }
}

class Lc_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n > 1){
            if(n%3 == 0){
                n /= 3;
            }
            else{
                break;
            }
        }
        return n == 1;
    }
}
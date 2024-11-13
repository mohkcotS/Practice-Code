class Lc_ReverseInteger {
    public int reverse(int x) {
        String s = String.valueOf(x);
        int end = 0;
        if(s.charAt(0) == '-'){
            end = 1;
        }
        String trans = "";
        for (int i = s.length()-1; i>=end;i--){
            trans += s.charAt(i);
        }
        long y = Long.parseLong(trans);
        if(end == 0){
            if (y > Integer.MAX_VALUE){
                return  0;
            }
        }
        else {
            y = 0 - y;
            if (y < Integer.MIN_VALUE){
                return  0;
            }
        }
        return (int) y;
    }
}
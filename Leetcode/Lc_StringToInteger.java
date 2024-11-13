class Lc_StringToInteger {
    public int myAtoi(String s) {
        String a = "";
        boolean hasDigit = false;
        for (int i =0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hasDigit) {
                if (c < '0' || c > '9') {
                    if(a.length() >= 1){
                        return 0;
                    }
                    if (c == '-' || c == '+') {
                        a += c;
                    }
                    else if (c != ' ') {
                        break;
                    }
                } else {
                    a += c;
                    hasDigit = true;
                }
            } else {
                if (c < '0' || c > '9') {
                    break;
                } else {
                    a += c;
                }
            }
        }

        if(a.isEmpty() || !hasDigit){
            return  0;
        }
        if(a.length() == 1){
            return Integer.parseInt(a);
        }

        int count = 0;
        int start = 0;
        if(a.charAt(0) == '-' ){
            start =1;
            count = 1;
        }
        for(int i = start; i < a.length();i++){
            if(a.charAt(i) == '0'){
                count++;
            }
            else {
                break;
            }
        }
        String b = "";

        for(int i = count ; i < a.length();i++){
            b += a.charAt(i);
        }
        System.out.println(b.length());
        if(b.length() < 19){
            if(b.isEmpty()){
                return  0;
            }
            long y = Long.parseLong(b);
            if(start == 1){
                y = 0 - y;
            }
            if (y > Integer.MAX_VALUE){
                return  Integer.MAX_VALUE;
            }
            if (y < Integer.MIN_VALUE){
                return  Integer.MIN_VALUE;
            }
            return (int)y;

        }
        else {
            if(a.charAt(0) == '-'){
                return Integer.MIN_VALUE;
            }
            else {
                return  Integer.MAX_VALUE;
            }
        }
    }

}
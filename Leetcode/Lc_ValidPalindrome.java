public class Lc_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1){
            return  true;
        }
        s= s.toLowerCase();
        int l = 0;
        int r =s.length()-1;
        while (l < r){
            while (Character.isLetterOrDigit(s.charAt(l))){
                l++;
                if(l > r){
                    return true;
                }
            }
            while (Character.isLetterOrDigit(s.charAt(r))){
                r--;
                if(l > r){
                    return true;
                }

            }
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            else {
                l++;
                r--;
            }
        }

        return  true;

    }


}

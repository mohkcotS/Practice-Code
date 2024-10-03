public class Lc_LongestPalindromicSubstring {
    public String LongestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        int first = 0;
        int last = 0;
        int count = 0;
        while (left != right){
            int l = left;
            int r = right;
            while (l != r){
                boolean check = true;
                if(s.charAt(l) == s.charAt(r)){
                    int l1 = l+1;
                    int r1 = r-1;
                    while (l1 != r1){
                        if(l1-1 == r1){
                            break;
                        }
                        if(s.charAt(l1) != s.charAt(r1)){
                            check = false;
                            break;
                        }
                        else {
                            l1++;
                            r1--;
                        }
                    }
                }
                else {
                    check= false;
                }
                if(check){
                    if(r-l+1 > count){
                        first = l;
                        last = r;
                        count = r-l+1;
                    }
                    break;
                }
                r--;
            }
            left++;
        }
        String str = "";
        for(int i = first; i<=last;i++){
            str = str + s.charAt(i);
        }

        return str;
    }
}

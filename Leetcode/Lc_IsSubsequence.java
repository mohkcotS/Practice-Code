public class Lc_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return  true;
        }
        if(t.isEmpty()){
            return  false;
        }

        int count = 0;
        for(int i = 0 ; i < t.length();i++){
            if(t.charAt(i) == s.charAt(count)){
                count++;
            }
            if(count == s.length()){
                return true;
            }
        }
        return false;
    }

}

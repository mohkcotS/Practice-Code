public class Lc_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].isEmpty()){
            return  "" ;
        }
        String max = strs[0];

        for(int i = 1; i <strs.length;i++){
            if(strs[i].isEmpty()){
                return "";
            }
            String s ="";
            for(int j = 0; j <strs[i].length();j++){
                if(j < max.length() && max.charAt(j) == strs[i].charAt(j)){
                    s += max.charAt(j);
                }
                else{
                    break;
                }
            }
            if(s.isEmpty()){
                return "";
            }
            max = s;

        }
        return max;
    }

}

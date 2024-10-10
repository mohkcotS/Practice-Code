public class Lc_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int last = 0;

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(count > 0){
                    last = count;
                    count = 0;
                }
            }
            else{
                count++;
            }
        }
        if(count > 0){
            last = count;
        }

        return last;
    }

}

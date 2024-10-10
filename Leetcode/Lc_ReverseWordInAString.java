public class Lc_ReverseWordInAString {
    public String reverseWords(String s) {
        String string ="";
        String [] word = s.trim().split("\\s+");
        for(int i = word.length-1;i>=0;i--){
            string += word[i];
            if(i != 0){
                string += " ";
            }
        }
        return  string;
    }

}

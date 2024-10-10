public class Lc_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        else {
            return  haystack.indexOf(needle);
        }
    }

}

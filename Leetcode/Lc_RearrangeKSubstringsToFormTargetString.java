import java.util.ArrayList;
import java.util.Collections;

public class Lc_RearrangeKSubstringsToFormTargetString {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int size = s.length() / k;
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        String s1 ="";
        String s2 ="";
        for (int i = 0; i<t.length();i++){
            if(i != 0 && i % size == 0){
                l1.add(s1);
                l2.add(s2);
                s1 = "";
                s2 = "";
            }
            s1 += s.charAt(i);
            s2 += t.charAt(i);
        }
        l1.add(s1);
        l2.add(s2);

        Collections.sort(l1);
        Collections.sort(l2);
        for(int i = 0; i <k;i++){
            if(!l1.get(i).equals(l2.get(i))){
                return false;
            }
        }
        return true;
    }
}

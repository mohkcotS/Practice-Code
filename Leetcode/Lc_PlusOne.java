import java.util.ArrayList;
public class Lc_PlusOne {
    public int[] plusOne(int[] digits) {
        ArrayList <Integer> l = new ArrayList<>();
        for (int i = digits.length-1; i>=0 ;i--){
            l.add(digits[i]);
        }
        l.add(0);

        l.set(0,l.get(0)+1);
        int i = 0;
        while (l.get(i) > 9){
            l.set(i,l.get(i)%10);
            l.set(i+1,l.get(i+1) + 1);
            i++;
        }
        int size = l.size();
        if(l.get(l.size()-1) == 0){
            size-=1;
        }
        int size1 = size-1;
        int [] result = new int[size];
        for(int j = 0;j<size;j++){
            result[j] = l.get(size1);
            size1--;
        }
        return result;
    }
}

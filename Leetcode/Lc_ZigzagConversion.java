public class Lc_ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return  s;
        }
        StringBuilder string = new StringBuilder();
        String [] a = new String[numRows];
        boolean increase = true;
        for(int i = 0;i<numRows;i++){
            a[i] = "";
        }
        a[0] += s.charAt(0);
        int count = 1;
        for(int i = 1; i<s.length();i++){
            if(increase){
                a[count] += s.charAt(i);
                count++;
            }
            else {
                a[count] += s.charAt(i);
                count--;
            }
            if(count == numRows ){
                count -= 2;
                increase = false;
            }
            if(count == -1){
                count+=2;
                increase = true;
            }
        }
        for (String value : a) {
            string.append(value);
        }
        return String.valueOf(string);
    }
}

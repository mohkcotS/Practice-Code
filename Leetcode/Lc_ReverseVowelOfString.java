class Lc_ReverseVowelOfString {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        StringBuilder n = new StringBuilder(s);
        while (l < r){
            while (l < r && !check(n.charAt(l))){
                l++;
            }
            while (l < r && !check(n.charAt(r))){
                r--;
            }
            char c = n.charAt(l);
            n.setCharAt(l,n.charAt(r));
            n.setCharAt(r,c);
        }
        return String.valueOf(n);
    }

    public boolean check(Character c){
        return c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o' ||
                c == 'A' || c == 'E' || c == 'U' || c == 'I' || c == 'O';
    }
}
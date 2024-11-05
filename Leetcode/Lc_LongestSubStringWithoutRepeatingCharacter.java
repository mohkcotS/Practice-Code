class LongestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1){
            return 1;
        }
        int max = 0;
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            for (int j = 0 ;j < a.length();j++){
                if(s.charAt(i) == a.charAt(j)){
                    int t = a.length();
                    if(t > max){
                        max = t;
                    }
                    System.out.println(j);
                    a.delete(0,j+1);
                    break;
                }
            }
            a.append(s.charAt(i));
            System.out.println(a + " " +a.length());
        }
        return Math.max(a.length(), max);
    }
}

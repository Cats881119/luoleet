public class Solution {
    private int getNumber(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    
    public int romanToInt(String s) {
        int rst = 0;
        for(int i = 0; i < s.length(); i++){
            if(i > 0 && getNumber(s.charAt(i - 1)) < getNumber(s.charAt(i))) rst -= 2 * getNumber(s.charAt(i - 1));
            rst += getNumber(s.charAt(i));
        }
        return rst;
    }
}
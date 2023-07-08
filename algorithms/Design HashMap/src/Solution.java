class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == ""){
            return 0;
        }
        
        for (int i=haystack.length()-needle.length()+1; i >= 0; i--){
            for (int j=needle.length()-1; j >= 0; j--)
            if (haystack.charAt(i) == needle.charAt(j)){
                return j;
            }
            else return -1;
        }
        return -1;
    }
}
class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    // brute force will be acceptable
    public int strStr(String source, String target) {
        if(source == null) {
            return -1;
        }
        if(target.equals("")) {
            return 0;
        }
        //write your code here
        for(int i = 0; i < source.length(); i++) {
            for(int j = 0; j < target.length(); j++) {
                if(i+j < source.length()) {
                    if(source.charAt(i+j) != target.charAt(j)) {
                        break;
                    }
                    if(j == target.length()-1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String finalWord = s.replace(" ", "").replace("?", "").replace(",","").replace(":","").replace("'","").replace(".","").replace("/","").replace("@","").replace("#","").replace("_","").replace("{","").replace("}","").replace("[","").replace("]","").replace("\\","").replace("'","").replace("\"","").replace("-","").replace(";","").replace("!","").replace("?","").replace("(","").replace(")","").replace("`","");
        char[] word = finalWord.toLowerCase().toCharArray();
        int max = word.length - 1;
        for(int i=0;i<word.length;i++,max--){
            if(word[i]!=word[max]){
                return false;
            }
        }
return true;
    }
}

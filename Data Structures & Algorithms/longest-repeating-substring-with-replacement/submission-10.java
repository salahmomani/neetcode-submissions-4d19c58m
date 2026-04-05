class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap();
        int result=0;
        int lenght=0;
        int maxVlaue=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
            maxVlaue=Math.max(maxVlaue,map.get(s.charAt(i)));

            while((i-lenght+1)-maxVlaue>k){
            map.put(s.charAt(lenght),map.get(s.charAt(lenght))-1);
            lenght++;

            }
        result=Math.max(result,i-lenght+1);
        } 
        return result;
    }
}

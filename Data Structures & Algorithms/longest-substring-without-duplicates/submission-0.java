class Solution {
    public int lengthOfLongestSubstring(String s) {
         char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        if (s.length() == 0 || s == null) return 0;
        if (s.length() == 1) return 1;
        int right = 0;
        int left = 0;
        int result = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}

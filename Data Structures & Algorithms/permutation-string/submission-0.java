class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        char[] array2 = s2.toCharArray();
        char[] array1 = s1.toCharArray();
        Arrays.sort(array1);
        for (int j = 0; j <= s2.length() - s1.length(); j++) {
            char[] subarray = new char[s1.length()];
            for (int i = 0; i < s1.length(); i++) {
                subarray[i] = array2[j + i];
            }
            Arrays.sort(subarray);
            if (Arrays.equals(subarray, array1)) {
                return true;
            }
        }
        return false;
    }
}

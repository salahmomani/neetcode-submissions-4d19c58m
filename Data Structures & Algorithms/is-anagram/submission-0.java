class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isEqual = Arrays.equals(arr1, arr2);

        if (isEqual) {
            return true;
        }
        return false;

    }
}

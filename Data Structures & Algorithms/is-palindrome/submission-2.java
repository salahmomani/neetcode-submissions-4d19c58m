class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replace(" ", "").replace("?", "").replace(",","").replace(":","").replace("'","").replace(".","");
        char[] word = result.toLowerCase().toCharArray();
        int max = word.length - 1;
        char[] reverse = new char[word.length];

        for (int i = 0; i < word.length ; i++, max--) {

            reverse[i] = word[max];
        }
        return Arrays.equals(reverse, word);

    }
    }


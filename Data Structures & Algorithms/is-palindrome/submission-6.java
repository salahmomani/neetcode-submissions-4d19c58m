class Solution {
    public boolean isPalindrome(String s) {
        String finalWord = s.replace(" ", "").replace("?", "").replace(",","").replace(":","").replace("'","").replace(".","");
        char[] word = finalWord.toLowerCase().toCharArray();
        int max = word.length - 1;
        char[] reverse = new char[word.length];

        for (int i = 0; i < word.length ; i++, max--) {

            reverse[i] = word[max];
        }
        return Arrays.equals(reverse, word);

    }
    }


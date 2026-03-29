class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         Map<String, List<String>> listMap = new HashMap<>();

        for (String s : strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);
            if (!listMap.containsKey(sortedWord)) {
                listMap.put(sortedWord, new ArrayList<>());
            }
            listMap.get(sortedWord).add(s);
        }
        return new ArrayList<>(listMap.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int freq[] = new int[26];
            String str = strs[i];
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int count : freq) {
                key.append(count).append('#');
            }
            String keyString = key.toString();
            key.toString();
            map.putIfAbsent(keyString, new ArrayList<>());
            map.get(keyString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
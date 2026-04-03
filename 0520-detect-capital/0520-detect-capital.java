class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) {
            return true;
        }
        String restOfWord = word.substring(1);
        if (Character.isUpperCase(word.charAt(0)) && restOfWord.equals(restOfWord.toLowerCase())) {
            return true;
        }

        return false;
    }
}
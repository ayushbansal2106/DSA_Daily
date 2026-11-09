class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stS = new Stack<>();
        Stack<Character> stT = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stS.isEmpty() && ch == '#') {
                stS.pop();
            } else if (ch != '#') {
                stS.push(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!stT.isEmpty() && ch == '#') {
                stT.pop();
            } else if (ch != '#') {
                stT.push(ch);
            }
        }
        return stS.equals(stT);
    }
}
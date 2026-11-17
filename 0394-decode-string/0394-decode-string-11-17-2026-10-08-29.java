class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } 
            else {
                StringBuilder str = new StringBuilder();

                while (!st.isEmpty() && st.peek() != '[') {
                    str.insert(0, st.pop());
                }
                st.pop();
                StringBuilder num = new StringBuilder();

                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.insert(0, st.pop());
                }

                int count = Integer.parseInt(num.toString());
                String decoded = str.toString().repeat(count);
                for (char ch : decoded.toCharArray()) {
                    st.push(ch);
                }
            }
        }
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }

        return ans.toString();
    }
}
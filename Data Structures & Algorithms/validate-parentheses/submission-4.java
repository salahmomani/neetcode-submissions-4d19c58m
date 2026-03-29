class Solution {
   
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char charOnString : s.toCharArray()) {
            if (charOnString == '{' || charOnString == '(' || charOnString == '[') {
                stack.push(charOnString);
            } else {
                if(stack.isEmpty()){return false;}
                char close = stack.pop();
                if (charOnString == ']' && close != '[' || charOnString == ')' && close != '(' || charOnString == '}' && close != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

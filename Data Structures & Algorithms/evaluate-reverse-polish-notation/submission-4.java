class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int firstValue=0;
        int secondValue=0;
        int result=0;
        for(String s:tokens){
            if(s.equals("+")){
                firstValue=stack.pop();
                secondValue=stack.pop();
                result=firstValue+secondValue;
                stack.push(result);
            }else if(s.equals("-")){
                firstValue=stack.pop();
                secondValue=stack.pop();
                result=secondValue-firstValue;
                stack.push(result);
            }else if(s.equals("*")){
                firstValue=stack.pop();
                secondValue=stack.pop();
                result=firstValue*secondValue;
                stack.push(result);
            }else if(s.equals("/")){
                firstValue=stack.pop();
                secondValue=stack.pop();
                result=secondValue/firstValue;
                stack.push(result);
            }else{
            stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}

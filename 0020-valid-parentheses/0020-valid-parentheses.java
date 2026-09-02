class Solution {
    public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray())
        {
            if(c=='(' || c== '{'|| c== '[')
            {
                    stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char f=stack.pop();
                if(f=='(' && c!=')'
                || f=='{' && c!='}'
                || f=='[' && c!=']'  )
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
class Solution {
    public int find(int a,int b,char o)
    {
        if(o=='+')
        {
             return a+b;
        }
        else if(o=='*')
        {
            return a*b;
        }
        else if(o=='-')
        {
               return b-a;
        }
        else
        {
              return b/a;
        }
    }
    public int evalRPN(String[] tokens) {
         Deque<Integer> stack = new ArrayDeque<>();
        for(String d:tokens)
        {
            if (d.equals("+") || d.equals("-") ||
                d.equals("*") || d.equals("/")) {

                char c = d.charAt(0);

                int a = stack.pop();
                int b = stack.pop();

                int c1 = find(a, b, c);
                stack.push(c1);
            }
            else {
                stack.push(Integer.parseInt(d));
            }

        }
        return stack.pop();
    }
}